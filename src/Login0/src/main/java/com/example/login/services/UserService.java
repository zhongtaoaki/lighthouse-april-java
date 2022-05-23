package com.example.login.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.models.User;
import com.example.login.repositories.UserRepository;

@Service
public class UserService{
	@Autowired //自动实例化以下类
    private UserRepository userRepository;
	
	public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
	
	public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public User createUser(String username, String password) {
		if (findByUsername(username) != null) return null;
		return userRepository.save(new User(username, password));		
	}
}

