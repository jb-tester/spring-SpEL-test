package com.example.springspeltest;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * *
 * <p>Created by irina on 7/8/2022.</p>
 * <p>Project: spring-SpEL-test</p>
 * *
 */
public class Bean1 {

    @Autowired List<Bean2> bean2List;

    public List<Bean2> getBean2List() {
        return bean2List;
    }
}
