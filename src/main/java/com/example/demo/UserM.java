package com.example.demo;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;



//1，使用@ConfigurationProperties注解绑定配置信息到封装类中
//2，封装类需要定义为Spring管理的bean，否则无法进行属性注入

@Component
@ConfigurationProperties(prefix = "usermodel")
public class UserM {

    public String name;

    public String age;

    public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserM{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
