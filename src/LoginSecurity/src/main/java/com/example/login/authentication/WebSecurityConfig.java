package com.example.login.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * 配置用户登录的方法
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	// 使用自定义的验证方法
	@Autowired
    private AuthenticationProviderImpl authProvider;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authenticationProvider(authProvider)		// 使用自定义验证方法（链接数据库）
			.authorizeRequests()						// 验证条件
				.antMatchers("/register").permitAll()   // 允许所有用户直接访问register请求（注册界面）
				.anyRequest().authenticated()           // 允许登陆的用户访问所有（其他）请求
				.and()
			.formLogin()								// 定义登录的方法
				.loginPage("/login")					// 使用自定义的登录页面（在/login的GET请求中定义）
				.permitAll()							// 允许所有用户访问登陆界面
				.and()
			.logout()									// 定义登出的方法
				.permitAll()							// 允许所有用户访问登出界面
				.and()
			.csrf()										// 关闭CSRF保护功能 https://en.wikipedia.org/wiki/Cross-site_request_forgery
				.disable();								// 这里不关闭的话POST请求会出错，如果实际运用建议开启（或手动添加CSRF检查）
	}

//	手动添加用户的方法
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("user")		// 用户名为"user"
//				.password("password")	// 密码为"password"
//				.roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
	
	// 设置访问任意静态文件时无需权限
	@Override
	public void configure(WebSecurity web) throws Exception {
	  web
	    .debug(false)
	    .ignoring()
	    .antMatchers("/images/**", "/js/**", "/css/**");
	}
}
