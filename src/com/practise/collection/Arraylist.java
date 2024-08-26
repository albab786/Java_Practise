package com.practise.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(15);
        for(int i=5;i<30;i=i*2){
            arr.add(i);
        }
        Collections.sort(arr);
//        System.out.println(arr);
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.addAll(arr);
//        System.out.println(arr2);
        System.out.println(arr.contains(10));
        for (Integer a:arr){
            System.out.print(a+ " ");
        }
    }


}
