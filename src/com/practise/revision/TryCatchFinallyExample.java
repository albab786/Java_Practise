package com.practise.revision;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static String testMethod() {
        try {
//            int a=5/0;
            System.out.println("In try block");
            return "Return from try";
        } catch (Exception e) {
            System.out.println("In catch block");
            return "Return from catch";
        } finally {
            System.out.println("In finally block");
            // The finally block is executed even if there is a return statement in try or catch.
            // If a return statement is added here, it will override the return from try or catch.
            return "Return from finally";
        }
    }
}
