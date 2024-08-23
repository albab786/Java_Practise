package com.practise.revision;

import java.util.ArrayList;

public class Delete {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};

        // Index to be removed
        int indexToRemove = 2;
        int[] newArray = new int[originalArray.length - 1];


        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i == indexToRemove) {
                continue;
            }
            newArray[j++] = originalArray[i];
        }

//        int arr[]={2,6,7,5,4,9,10,12};
//        int to_be_deleted=2;
//
//        for (int i=0;i< arr.length;i++){
//            if(i==to_be_deleted)
//        }
//        ArrayList<Integer>list=new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            if(i==to_be_deleted){
//                continue;
//            }
//            list.add(arr[i]);
//        }
//        int ans[] = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            ans[i] = list.get(i);
//        }
    }
}
