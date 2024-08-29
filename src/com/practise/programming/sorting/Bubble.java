package com.practise.programming.sorting;

public class Bubble {
    public static void getSort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }

        }
    }
    public static void swap(int [] nums ,int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
    public static void printHalfAsecAndDesc(int arr[]){
        getSort(arr);
        for (int i=0;i< arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i= arr.length-1; i> (arr.length/2) ;i--){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,9,0,12,8,7};
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        getSort(arr);
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        printHalfAsecAndDesc(arr);
    }
}
