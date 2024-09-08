package com.practise.programming.micilenious;

public class Q132 {
    public static boolean checkPalindrome(String input){
        int i=0;
        int j=input.length()-1;
        while (i<j){
            if(input.charAt(i)!=input.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("bob"));
    }
}
