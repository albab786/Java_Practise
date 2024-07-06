package com.practise.oops.abstraction.interfaces;

public interface BMW {
    abstract void start();
    public void stop();
    public static final String COMPANY_NAME="BMW";
    default void applyBrakes() {
        System.out.println("It stops");
    }


}
