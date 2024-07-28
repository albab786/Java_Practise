package com.practise.basic;

public class Practise {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    public static boolean checkPerfectNumber(int num) {
        int sum=0;
        int i=1;
        while(i<num){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
