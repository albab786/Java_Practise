package com.practise.exceptionhandling;

public class Myexcpt extends Exception{
    String msg;
    Myexcpt(String msg){
        this.msg=msg;
    }
}
