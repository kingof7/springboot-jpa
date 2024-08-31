package com.alibou.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

	@Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	public MyFirstClass myFirstClass() {
		return new MyFirstClass("First bean");
	}

	@Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	public MyFirstClass mySecondClass() {
		return new MyFirstClass("Second bean");
	}

	@Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	@Primary
	public MyFirstClass myThirdClass() {
		return new MyFirstClass("Third bean");
	}
}
