package com.example.springspeltest;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Bean1 {

    @Autowired List<Bean2> bean2List;

    public List<Bean2> getBean2List() {
        return bean2List;
    }
}
