package com.example.demo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


//Navigate -> File structure查看
//@AllArgsConstructor
//@NoArgsConstructor
 @Data
 @TableName("user")
 public class User {
    @TableId(type = IdType.AUTO)
    private Long id;

    public String username;

    public String password;

    public String email;

    public Number is_admin;

    public String mobile;

    public Number isDelete;

    public Number version;

    public String salt;

    public Date create_time;
    
    public String test_name;
}
