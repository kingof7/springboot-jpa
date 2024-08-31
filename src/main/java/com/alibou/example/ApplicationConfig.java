package com.alibou.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	@Qualifier("bean1")
	public MyFirstClass myFirstClass() {
		return new MyFirstClass("First bean");
	}

	@Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	@Qualifier("bean2")
	public MyFirstClass mySecondClass() {
		return new MyFirstClass("Second bean");
	}
}
