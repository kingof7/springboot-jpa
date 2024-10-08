package com.alibou.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);

//		MyFirstClass myFirstClass = ctx.getBean("myFirstBean", MyFirstClass.class);
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

	// @Bean // MyFirstClass를 스프링 컨테이너의 빈으로 등록
	// public MyFirstClass myFirstClass() {
	// return new MyFirstClass();
	// }

}
