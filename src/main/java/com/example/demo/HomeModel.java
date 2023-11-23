package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//1，使用@ConfigurationProperties注解绑定配置信息到封装类中
//2，封装类需要定义为Spring管理的bean，否则无法进行属性注入
@Data
@Component
@ConfigurationProperties(prefix = "usermodel")
public class HomeModel {

    public String name;

    public String age;

    public String gender;
}
