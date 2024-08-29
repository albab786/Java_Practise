package com.practise.revision.advance;

class Solution {
    public static void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int nz=0;
        int z=0;
        while(nz!=nums.length){
            if(nums[nz]!=0){
                swap(nums,nz,z);
                nz++;
                z++;

            }else{
                nz++;
            }
            
        }
    }
   public static void swap(int [] nums ,int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12} ;
        moveZeroes(nums);
    }
}