package com.practise.revision;

public class InsufficientFundsException extends Exception{
    InsufficientFundsException(){
        super("Insufficient funds in your account.");
    }
   // Constructor that accepts a custom message
    public InsufficientFundsException(String message) {
        super(message);
    }
    // Constructor that accepts a custom message and a cause
    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }
    // Constructor that accepts a cause
    public InsufficientFundsException(Throwable cause) {
        super(cause);
    }
}
