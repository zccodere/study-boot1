package com.zccoder.springboot;

import com.zccoder.springboot.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Mybootch720Application {

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
		SpringApplication.run(Mybootch720Application.class, args);
	}
}
