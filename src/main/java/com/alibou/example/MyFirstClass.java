package com.alibou.example;

import org.springframework.stereotype.Component;

@Component// 스프링 컨테이너에 빈으로 등록
public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from the MyFirstClass ==> myVar = " + myVar;
    }
}