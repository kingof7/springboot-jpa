package com.alibou.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean("bean1")
	public MyFirstClass myFirstClass() {
		return new MyFirstClass("First bean");
	}

	@Bean
	public MyFirstClass mySecondClass() {
		return new MyFirstClass("Second bean");
	}

	@Bean
	public MyFirstClass myThirdClass() {
		return new MyFirstClass("Third bean");
	}
}
