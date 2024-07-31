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
    public static void pattern4(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern5(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                    System.out.print("*    ");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern6(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                    System.out.print(i+"  ");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern7(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1, k=1;j<=n;j++){
                if(i+j>=n+1) {
                    System.out.print(k + "  ");
                    k++;
                }
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern8(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1) {
                    System.out.print(i%2+ "  ");

                }
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(3);
        pattern6(4);
        pattern7(4);
        pattern8(4);

    }
}
