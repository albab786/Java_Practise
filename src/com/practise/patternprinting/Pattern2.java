package com.practise.patternprinting;

public class Pattern2 {
    public static void pattern10(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j|| i+j==n+1){
                    System.out.print("*"+" ");

                }
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
    public static void pattern11(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*"+" ");

                }
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
//    public static void pattern12(int n) {
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1||i==2||i==n-1||j==1||j==2||j==n-1){
//                    System.out.print("*"+" ");
//
//                }
//                else
//                    System.out.print("  ");
//            }
//
//            System.out.println();
//        }
//    }
public static void pattern13(int n) {

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1){
                System.out.print("*"+" ");

            }
            else
                System.out.print("  ");
        }

        System.out.println();
    }
}
    public static void main(String[] args) {
//        pattern10(5);
//        pattern11(5);
//        pattern12(4);
        pattern13(5);
    }
}
