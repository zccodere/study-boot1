package com.zccoder.mybootch946;

import static java.lang.System.getProperty;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.channel.MessageChannels;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.dsl.file.Files;
import org.springframework.integration.dsl.mail.Mail;
import org.springframework.integration.feed.inbound.FeedEntryMessageSource;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.integration.file.support.FileExistsMode;

import com.rometools.rome.feed.synd.SyndEntry;

/**
 * @title 启动类
 * @describe Spring Integration快速入门
 * @author zc
 * @version 1.0 2017-10-09
 */

@SpringBootApplication
public class Mybootch946Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybootch946Application.class, args);
	}

	// 通过@Value注解自动获得 https://spring.io/blog.atom 的资源
	@Value("https://spring.io/blog.atom")
	Resource resource;

	@Bean(name=PollerMetadata.DEFAULT_POLLER)
	public PollerMetadata poller(){
		// 使用FluentAPI和Pollers配置默认的轮询方式
		return Pollers.fixedRate(500).get();
	}

	@Bean
	public FeedEntryMessageSource feedMessageSource() throws IOException {
		FeedEntryMessageSource messageSource = new FeedEntryMessageSource(resource.getURL(), "news");
		return messageSource;
	}

	@Bean
	public IntegrationFlow myFlow() throws IOException {
		return IntegrationFlows.from(feedMessageSource())
				.<SyndEntry, String> route(payload -> payload.getCategories().get(0).getName(),
						mapping -> mapping.channelMapping("releases", "releasesChannel")
								.channelMapping("engineering", "engineeringChannel")
								.channelMapping("news", "newsChannel"))

				.get();
	}

	@Bean
	public IntegrationFlow releasesFlow() {
		// 通过消息通道 releasesChannel 开始获取数据
		return IntegrationFlows.from(MessageChannels.queue("releasesChannel", 10))
				// 使用 transform 方法进行数据转换
				.<SyndEntry, String> transform(
						payload -> "《" + payload.getTitle() + "》 " + payload.getLink() + getProperty("line.separator"))
				.handle(Files.outboundAdapter(new File("e:/springblog"))
						.fileExistsMode(FileExistsMode.APPEND)
						.charset("UTF-8")
						.fileNameGenerator(message -> "releases.txt")
						.get())
				.get();
	}

	// engineering 流程
	@Bean
	public IntegrationFlow engineeringFlow() {
		return IntegrationFlows.from(MessageChannels.queue("engineeringChannel", 10))
				.<SyndEntry, String> transform(
						payload -> "《" + payload.getTitle() + "》 " + payload.getLink() + getProperty("line.separator"))
				.handle(Files.outboundAdapter(new File("e:/springblog"))
						.fileExistsMode(FileExistsMode.APPEND)
						.charset("UTF-8")
						.fileNameGenerator(message -> "engineering.txt")
						.get())
				.get();
	}

	// news流程
	@Bean
	public IntegrationFlow newsFlow() {
		return IntegrationFlows.from(MessageChannels.queue("newsChannel", 10))
				.<SyndEntry, String> transform(
						payload -> "《" + payload.getTitle() + "》 " + payload.getLink() + getProperty("line.separator"))
				// 通过 enrichHeaders 来增加消息头的信息
				.enrichHeaders( //1
						Mail.headers()
								.subject("来自Spring的新闻")
								.to("zccodere@163.com")
								.from("zccodere@163.com"))
				// 邮件发送的相关方法通过Spring Integration Java DSL 提供的Mail的headers方法来构造
				.handle(Mail.outboundAdapter("smtp.163.com")
						.port(25)
						.protocol("smtp")
						.credentials("zccodere@163.com", "******")
						.javaMailProperties(p -> p.put("mail.debug", "false")), e -> e.id("smtpOut"))
				.get();
	}

}
