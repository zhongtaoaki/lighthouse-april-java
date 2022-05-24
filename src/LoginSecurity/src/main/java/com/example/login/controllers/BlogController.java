package com.example.login.controllers;

import java.util.List;
import java.util.Map; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.login.models.Blog;
import com.example.login.models.User;
import com.example.login.services.BlogService;
import com.example.login.services.UserService;


@Controller
public class BlogController {
	@Autowired
	private BlogService blogService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/blog")
	public ModelAndView blog(ModelAndView mv) {
		List<Blog> blogs = blogService.findBlogsByUsername(Utils.getCurrentUsername());
		mv.addObject("blogs", blogs);
		mv.setViewName("blog");
		return mv;
	}
	
	@GetMapping("/editor")
	public String editor() {
		return "editor"; 
	}
	
	@PostMapping("/editor")
	public ModelAndView addBlog(@RequestParam("title") String title, @RequestParam("content") String content) {
		User user = userService.findByUsername(Utils.getCurrentUsername());
		blogService.addBlog(title, content, user);
		ModelAndView mv = new ModelAndView("redirect:/blog");
		return mv;
	}
}