package com.practise.exceptionhandling;

public class Main {
    public static void validate(int age) {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        if(age>0){
            System.out.println("running");
        }else {
            System.out.println("Person is eligible to vote!!");
        }
    }
        public static void main(String[] args) {
            validate(13);
//            String mob = "7886954120";
//
//        if(mob.length() < 10 ) {
//            try {
//                throw new CustomeException("Mob number should be in 10 digit");
//
//
//            } catch (CustomeException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
