package com.zccoder.boot1.ch7.web.thymeleaf;

import com.zccoder.boot1.ch7.web.thymeleaf.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @title 启动类
 * @describe Thymeleaf 模版引擎
 * @author zc
 * @date 2017/04/04
 **/
@Controller
@SpringBootApplication
public class WebThymeleafStart {

	@RequestMapping("/")
	public String index(Model model){
		Person single = new Person("aa",11);

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx",11);
		Person p2 = new Person("yy",22);
		Person p3 = new Person("zz",33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);

		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebThymeleafStart.class, args);
	}
}
