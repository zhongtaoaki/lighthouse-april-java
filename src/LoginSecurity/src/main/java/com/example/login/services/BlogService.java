package com.example.login.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.models.Blog;
import com.example.login.models.User;
import com.example.login.repositories.BlogRepository;
import com.example.login.repositories.UserRepository;

@Service
public class BlogService{
	@Autowired //自动实例化以下类
    private BlogRepository blogRepository;
	@Autowired
    private UserRepository userRepository;
	
	public List<Blog> findBlogsByUsername(String userName) {
		return blogRepository.findByUserId(userRepository.findByUsername(userName).getId());
	}
	public Blog addBlog(String title, String content, User user) {
		return blogRepository.save(new Blog(title, content, user));		
	}
	
}
