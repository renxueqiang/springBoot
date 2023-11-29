package com.example.demo;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
}
