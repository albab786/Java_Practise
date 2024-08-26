package com.practise.revision;

public class Handling {
    public static void main(String[] args) {
        try{
            int ans=5/5;
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("hello");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("code ends");
    }
}
