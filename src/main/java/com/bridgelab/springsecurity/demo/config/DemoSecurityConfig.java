package com.bridgelab.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// add user memory Authentication
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("jaya").password("jaya123").roles("Employee"))
		.withUser(users.username("sunil").password("sunil123").roles("Manager"))
		.withUser(users.username("priya").password("priya23").roles("Admin"));


	}
	
}
