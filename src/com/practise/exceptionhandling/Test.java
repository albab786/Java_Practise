package com.practise.exceptionhandling;

public class Test {
    public static void main(String[] args) {
//        int arr[]={1,5,7};
//        try{
//
//            int c=arr[3];
//            System.out.println(7/0);
//        }catch (ArithmeticException e) {
//            System.out.println("ist exception caught");
//        }
//
//        catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("2nd exception");
//            }
//        try{
//            System.out.println(arr[4]);
//            try{
//                int ans =2/0;
//                System.out.println(ans);
//            }catch (ArithmeticException e){
//                System.out.println("handled");
//            }
//
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("outer handled");
//        }
        int[] arr = {1, 2, 3, 4, 5}; // Example array with at least 5 elements

        try {
            // Outer try block
            System.out.println("Accessing element 4 of the array...");
            System.out.println(arr[4]); // This will not cause ArrayIndexOutOfBoundsException

            try {
                // Inner try block
                System.out.println("Performing division by zero...");
                int ans = 2 / 0; // This will cause ArithmeticException
                System.out.println(ans);
            } catch (ArithmeticException e) {
                // Catch block for the inner try block
                System.out.println("Inner catch block: ArithmeticException handled.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for the outer try block
            System.out.println("Outer catch block: ArrayIndexOutOfBoundsException handled.");
        }

        System.out.println("Program continues after the try-catch blocks.");
        }
    }

