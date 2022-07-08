package com.example.springspeltest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Spel_Compo {



    // https://youtrack.jetbrains.com/issue/IDEA-154731
    // collections selection and projection
    @Value("#{@bean1.bean2List.?[int_prop == str_prop.indexOf('2')]}")
    Bean2 test1;
    @Value("#{@bean1.bean2List.![int_prop]}")
    int[] test2;

    // https://youtrack.jetbrains.com/issue/IDEA-297638
    // safe collections selection and projection
    @Value("#{@bean1.bean2List?.?[int_prop == 3]}")
    Bean2 test3;
    @Value("#{@bean1.bean2List?.![str_prop]}")
    String[] test4;

    public void displayResults(){
        System.out.println("--collection selection: \n"+ test1);
        System.out.println("--collection projection: ");
        for (int i : test2) {
            System.out.println(i);
        }
        System.out.println("--safe collection selection: \n"+ test3);
        System.out.println("--safe collection projection:");
        for (String s : test4) {
            System.out.println(s);
        }

    }
}
