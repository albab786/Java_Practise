package com.practise.basic;

public class PrintDigitLToR {
    public static void printLeftToRight(int n){
        String numberString = Integer.toString(n);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i) );
        }
    }
    public static void secondWay(int n){
        int arr[]=new int[count(n-1)];

            for(int i=0;i<arr.length;i++){
                arr[i]=n%10;
                n=n/10;
            }

        for(int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int reverse(int n){
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+ rem;
            n=n/10;
        }
        return rev;
    }
    public static void thirdWay(int m){
        int rev=reverse(m);
        while (rev>0){
            System.out.println(rev%10);
            rev=rev/10;

        }
    }

    public static void main(String[] args) {
//        secondWay(789609);
        thirdWay(45678);
    }
}
