package com.practise.patternprinting;

public class Pattern {
    public static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
//                if(j>i ||j==i )
//                System.out.print("*");
//                else
//                    System.out.print(" ");
                if(i>j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        int p=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                System.out.print("*");
            }
            p--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
    }
}
