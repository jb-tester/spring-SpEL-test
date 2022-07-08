package com.example.springspeltest;


public class Bean2 {
    private final String str_prop;
    private final int int_prop;

    public Bean2(String str_prop, int int_prop) {
        this.str_prop = str_prop;
        this.int_prop = int_prop;
    }

    public String getStr_prop() {
        return str_prop;
    }

    public int getInt_prop() {
        return int_prop;
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "str_prop='" + str_prop + '\'' +
                ", int_prop=" + int_prop +
                '}';
    }
}
