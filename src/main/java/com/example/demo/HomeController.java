package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    //使用自动装配将所有数据封装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private HomeModel user;

    @Value("${usermodel.name}")
    public String name;

    @Value("${usermodel.age}")
    public String age;

    @Value("${usermodel.tel}")
    public String tel;
    @GetMapping
    public String hello() {
        //第一种读取方式
        System.out.println("第一种方式Environment:"+env.getProperty("usermodel.name"));

        //第二种读取方式
        System.out.println("第二种方式ConfigurationProperties:"+ user);

        //第三种读取方式   @Value("${usermodel.name}")
        System.out.println("第三种方式@Value:"+ name + age + tel);

        return "Hello, World!";
    }
}
