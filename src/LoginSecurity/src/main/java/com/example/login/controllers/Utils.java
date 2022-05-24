package com.example.login.controllers;

import org.springframework.security.core.context.SecurityContextHolder;

public class Utils {
	public static String getCurrentUsername() {
		return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
}
