package com.practise.programming.micilenious;

public class Q131 {
    public static String getReverse(String s){
        String rev="";
        for (int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return  rev;
    }

    public static void main(String[] args) {
        System.out.println(getReverse("abcd"));
    }
}
