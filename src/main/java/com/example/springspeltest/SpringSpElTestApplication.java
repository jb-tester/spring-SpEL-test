package com.example.springspeltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSpElTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringSpElTestApplication.class, args);
    }
    @Autowired
    Spel_Compo _compo;
    @Override
    public void run(String... args) throws Exception {
       _compo.displayResults();
    }
}
