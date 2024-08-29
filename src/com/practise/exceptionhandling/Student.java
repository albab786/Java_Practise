package com.practise.exceptionhandling;

public class Student {
    public static void check(int score){
        if(score>100){
            System.out.println("you are eligible");
        }
        else
            try {
                throw new Myexcpt("jao yaha se");
            } catch (Myexcpt e) {
                System.out.println(e.msg);
            }
    }

    public static void main(String[] args) {
        check(99);
//        try{
//        check(99);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }

}
