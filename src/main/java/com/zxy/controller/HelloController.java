package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello.htm")
	public String hello(){
		System.out.println("hello");
		return "hello";
	}
}

