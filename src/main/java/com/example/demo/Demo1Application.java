package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
//SpringBoot的引导类是Boot工程的执行入口，运行main方法就可以启动项目
// SpringBoot工程运行后初始化Spring容器，扫描引导类所在包加载bean
public class Demo1Application {

    public static void main(String[] args) {

        // 就是启动一个spring boot 容器 定义的bean就可加载到这个容器中
        //扫描所在类文件夹下所有文件
     ConfigurableApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);

        HomeController bena = ctx.getBean(HomeController.class);
        System.out.println("hahahhah----"+bena);
    }

}
//1，内嵌Tomcat服务器是SpringBoot辅助功能之一
//2，内嵌Tomcat工作原理是将Tomcat服务器作为对象运行，并将该对象交给Spring容器管理
//3，变更内嵌服务器思想是去除现有服务器，添加全新的服务器