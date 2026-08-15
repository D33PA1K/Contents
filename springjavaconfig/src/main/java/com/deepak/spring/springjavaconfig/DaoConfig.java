package com.deepak.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
	@Bean
	public Dao dao() { // it is similar to Dao dao = new Dao();
		return new Dao();
	}
}
