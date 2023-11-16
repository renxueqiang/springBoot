package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;

//@Component
//@ConfigurationProperties(prefix = "usermodel")
//public class UserM {
//    public String name;
//
//    public String age;
//
//    public String tel;
//    public List<String> arr;
//
//}
@Component
public class UserM {

    public String name;

    public Integer age;

    public String gender;

//    public UserM(String name, Integer age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
