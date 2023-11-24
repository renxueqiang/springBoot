package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMybatisPlusConfig {

    @Bean  // 配置分页插件
    public MybatisPlusInterceptor paginationInnerInterceptor(){
        //定义Mp拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //添加具体拦截器  PaginationInnerInterceptor为分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}