package com.example.login.controllers;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.login.models.User;
import com.example.login.services.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login"; // 自动去templates里找到login.html并返回给用户
	}
	
	@GetMapping("/")
	public String home() {
		return "/blog";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register"; 
	}
	
	@PostMapping("/register")
	public String registerValidate(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("password_again") String passwordAgain) {
		if (userService.createUser(username, password) != null) {
			System.out.println("yes");
			return "/login"; 
		}
		System.out.println("no");
		return "/register"; 
	}
}
