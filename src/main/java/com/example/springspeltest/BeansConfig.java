package com.example.springspeltest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 7/8/2022.</p>
 * <p>Project: spring-SpEL-test</p>
 * *
 */
@Configuration
public class BeansConfig {
    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean
    public Bean2 bean21() {
        return new Bean2("b21",1);
    }
    @Bean
    public Bean2 bean22() {
        return new Bean2("b22",2);
    }
    @Bean
    public Bean2 bean23() {
        return new Bean2("b25",4);
    }
    @Bean
    public Bean2 bean24() {
        return new Bean2("b24",3);
    }
}
