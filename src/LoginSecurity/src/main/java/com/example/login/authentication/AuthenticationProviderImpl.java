package com.example.login.authentication;

import java.util.Collections;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.example.login.models.User;
import com.example.login.repositories.UserRepository;

/**
 * 自定义的验证方式，和数据库连接检测用户名和密码的正确性。
 */
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {
	// 链接自定义的数据库
    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {
    	// 获取需要验证的用户名和密码
        final UsernamePasswordAuthenticationToken upAuth = (UsernamePasswordAuthenticationToken) authentication;
        final String name = (String) authentication.getPrincipal();
        final String password = (String) upAuth.getCredentials();

        // 检测用户名是否存在于数据库
        final User user = userRepository.findByUsername(name);
        if (user == null) throw new BadCredentialsException("illegal id or passowrd");    
        
        // 检测密码是否符合
        final String storedPassword = userRepository.findByUsername(name).getPassword();
        if (Objects.equals(password, "") || !Objects.equals(password, storedPassword)) {
            throw new BadCredentialsException("illegal id or passowrd");
        }

        // 验证成功，返回一个token
        final Object principal = authentication.getPrincipal();
        final UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(
            principal, authentication.getCredentials(),
            Collections.emptyList());
        result.setDetails(authentication.getDetails());

        return result;
    }

    @Override
    public boolean supports(final Class<?> authentication) {
        return true;
    }

}