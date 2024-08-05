package com.practise.revision;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int k=0; if(nums.length==0) return k;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
            }
        } return k+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        System.out.println(removeDuplicates(arr));
    }
}