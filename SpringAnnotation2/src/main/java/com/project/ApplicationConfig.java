package com.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	
	}
	@Bean
public MobileProcessor getProcessor() {
	return new SnapDragon();
	
}
}