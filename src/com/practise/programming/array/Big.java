package com.practise.programming.array;

public class Big {
    public static void getTwoBigges(int arr[]){
        int big=Integer.MIN_VALUE;
        int secondBig=Integer.MIN_VALUE;
        if(arr.length<2) {
            System.out.println("array is not valid");
        }
            for (int i=0;i<arr.length;i++){
                if(arr[i]>big){
                    secondBig=big;
                    big=arr[i];
                }
            }
        System.out.println("biggest is"+ big);
        System.out.println("second biggest is"+secondBig);

    }
    public static void getTwoLowest(int arr[]){
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        if(arr.length<2) {
            System.out.println("array is not valid");
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondsmall=small;
                small=arr[i];
            }
        }
        System.out.println("smallest is"+small);
        System.out.println("second smallest"+ secondsmall);
    }

    public static void main(String[] args) {
        int arr[]={1,2,8,0,-7,8,9,10};
        getTwoBigges(arr);
        getTwoLowest(arr);
    }
}
