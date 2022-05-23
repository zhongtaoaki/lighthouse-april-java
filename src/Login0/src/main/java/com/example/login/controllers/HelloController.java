package com.example.login.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(@RequestParam("hello_username") String username, Map<String, Object> map) { // 作为参数传进来
		map.put("hello_username", username); // 将前端需要的参数放进去
		return "hello"; 
	}
}

