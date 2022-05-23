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
	
	@PostMapping("/login") // 匹配html中action为“/login”的form标签
	public ModelAndView loginValidate(@RequestParam("username") String username, @RequestParam("password") String password) {
		ModelAndView mv;
		if (userService.findByUsername(username) != null && userService.findByUsername(username).getPassword().equals(password)) {
			mv = new ModelAndView("redirect:/blog"); // 将转发地址/blog作为初始化参数进行实例化
			Long userId = userService.findByUsername(username).getId();
			mv.addObject("user_id", userId); // 将userId的值传给blog controller
			
			return mv;
		}
		mv = new ModelAndView("/login"); // 将/login作为初始化参数进行实例化
		mv.addObject("isFailed", true); // 将isFailed的值传给login.html的变量hello_username
		return mv; 
	}
	
	@GetMapping("/register")
	public String register() {
		return "register"; 
	}
	
	@PostMapping("/register") 
	public String registerValidate(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("password_again") String passwordAgain) {
		if (userService.createUser(username, password) != null) {
			System.out.println("yes");
			return "/register"; 
		}
		System.out.println("no");
		return "/register"; 
	}
	
	@GetMapping("/user")
	public String user(@RequestParam("bye_username") String username, Map<String, Object> map) { // 作为参数传进来
		User user = userService.findByUsername(username);
		map.put("user", user); // 将前端需要的参数放进去
		return "user"; 
	}
	
	
	
	
}
