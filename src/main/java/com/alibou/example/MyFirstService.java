package com.alibou.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass; // 주입받는 필드에 final 붙여야함 1:1 이라서

//    @Autowired, 생략가능
    public MyFirstService(MyFirstClass myFirstClass) { // dto 주입
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() { // tellAStory()로 myFirstClass.sayHello()를 간접적으로 호출
        return "the dependency is saying : " + myFirstClass.sayHello();
    }

}
