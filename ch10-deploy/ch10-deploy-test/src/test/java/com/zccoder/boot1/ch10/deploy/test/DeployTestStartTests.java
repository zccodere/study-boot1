package com.zccoder.boot1.ch10.deploy.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zccoder.boot1.ch10.deploy.test.dao.PersonRepository;
import com.zccoder.boot1.ch10.deploy.test.domain.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

/**
 * @title 测试类
 * @describe 测试用例
 * // 使用@Transactional注解，确保每次测试后的数据将会被回滚
 * @author zc
 * @version 1.0 2017-10-10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DeployTestStartTests {

	@Autowired
    PersonRepository personRepository;

	MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationContext;

	String expectedJson;

	/**
	 * // 使用Junit的@Before注解可在测试开始前进行一些初始化的工作
	 * @throws JsonProcessingException
	 */
	@Before
	public void setUp() throws JsonProcessingException{
		Person p1 = new Person("zc1");
		Person p2 = new Person("zc2");

		personRepository.save(p1);
		personRepository.save(p2);

		// 获得期待返回的字符串
		expectedJson = this.objectToJson(personRepository.findAll());
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	protected String objectToJson(Object object)throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}

	@Test
	public void personControllerTest() throws Exception{
		String uri = "/person";
		// 获得一个request的执行结果
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		// 获得request执行结果的状态
		int status = result.getResponse().getStatus();
		// 获得request执行结果的内容
		String content = result.getResponse().getContentAsString();

		// 将预期状态200和实际状态比较
		Assert.assertEquals("错误，正确的返回值为200",200,status);
		// 将预期字符串和返回字符串比较
		Assert.assertEquals("错误，返回值和预期返回值不一致",expectedJson,content);
	}

}
