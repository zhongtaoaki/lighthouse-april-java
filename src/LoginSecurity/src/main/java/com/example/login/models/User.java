package com.example.login.models;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity // 注释以下类会被用来创建实例
@Table(name = "users") // 告诉Spring这个类是users表的映射
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // 自动增加生成
	private Long id;
	
	@Size(min = 3, max = 100)
	@Column(name = "username")
	private String username;

	@Size(min = 3, max = 100)
	@Column(name = "password")
	private String password;
	
	
	public User() {
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + username + ", password=" + password + "]";
	}

}
