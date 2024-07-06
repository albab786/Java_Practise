package com.practise.exceptionhandling;

public class CustomeException extends Exception{
    private String message;
    public CustomeException(String message) {
        this.message = message;
    }
}
