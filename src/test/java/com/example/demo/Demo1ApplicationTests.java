package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    UserModelMapper userMapper;
    @Test
    void contextLoads() {

        User user1 = userMapper.selectById(1);
        System.out.println("查询一条:");
        System.out.println(user1);
        System.out.println("---------------------");

        List<User> userList = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println("查询多条:");
        System.out.println(userList);
        System.out.println("---------------------");

        List<User> aa =  userMapper.selectList(null);
        System.out.println("查询全部:");
        System.out.println(aa);
        System.out.println("---------------------");



        //根据 LambdaQueryWrapper 的条件查询
        Page<User> page = new Page<>(1, 1);  // 查询第一页，每页显示1条数据
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.like(true,User::getUsername,"qq");
        Page<User> user3 = userMapper.selectPage(page, lqw);
        System.out.println("条件查询:");
        System.out.println("数据总条数：" + user3.getTotal());
        System.out.println("数据总页数：" + user3.getPages());
        System.out.println("当前页数：" + user3.getCurrent());
        List<User> records = user3.getRecords();
        for (User record : records) {
            System.out.println(record);
        }
        System.out.println("---------------------");

        //根据 QueryWrapper 的条件查询
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.like("email", "qq"); // 设置查询条件
        List<User> iPage = userMapper.selectList(wrapper);
        System.out.println("条件查询:");
        System.out.println(iPage);
        System.out.println("---------------------");








    }

}
