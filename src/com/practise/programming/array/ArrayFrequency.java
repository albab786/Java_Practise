package com.practise.programming.array;

public class ArrayFrequency {

    public static void main(String[] args) {
        int arr[]={1,7,9,-2,1,7,55,44,55};
        getFrequency(arr);
    }
//    public static void getFrequency(int arr[]){
//        for (int i=0;i< arr.length;i++) {
//            int freq = 0;
//
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    freq++;
//                }
//            }
//
//            System.out.println("freq of"+arr[i] +" is"+"  "+freq);
//
//        }
//    }
public static void getFrequency(int arr[]) {
    boolean[] visited = new boolean[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (visited[i]) {
            continue;
        }

        int freq = 1;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                freq++;
                visited[j] = true;
            }
        }

        System.out.println("Frequency of " + arr[i] + " is " + freq);
    }
}

}
