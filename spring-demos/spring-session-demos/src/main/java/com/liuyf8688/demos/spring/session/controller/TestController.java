package com.liuyf8688.demos.spring.session.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test(HttpServletRequest request) {
		System.out.println(request.getSession().getId());
		
		double random = Math.random();
		request.getSession().setAttribute("liuyanfeng", random);
		System.out.println("=====================random: " + random);
		return "test";
	}
}
