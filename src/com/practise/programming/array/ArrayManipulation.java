package com.practise.programming.array;

public class ArrayManipulation {
    public static void main(String[] args) {
        int arr[]={1,5,7,100,9,-5,144,15};
//        printAtEvenIndex(arr);
//        printEven(arr);
//        printAllThreeDigitNumber(arr);
//        getBigAndSmallest(arr);
        int [] result=insertElemnt(arr,2,25);
    for (int i=0;i<result.length;i++){
        System.out.print(result[i]+ "   ");
    }
    }
    public static void printAtEvenIndex(int arr[]){
        for (int  i=0;i< arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static void printEven(int arr[]){
        for (int  i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static void printAllThreeDigitNumber(int arr[]){
        for (int  i=0;i< arr.length;i++){
            if(countDigit(arr[i])==3){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static  int countDigit(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void getBigAndSmallest(int arr[]){
        int big=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            big=Math.max(big,arr[i]);
            big=Math.min(small,arr[i]);
        }
        System.out.println("max is " +big);
        System.out.println("small is"+ small);
    }
    public static int [] insertElemnt(int arr[],int index,int val){
        int ans[]=new int[arr.length+1];
        ans[index]=val;
        for (int i=0;i< arr.length;i++){
            if(i<index){
                ans[i]=arr[i];
            }else{
                ans[i++]=arr[i];
            }

        }
        return ans;
    }
}
