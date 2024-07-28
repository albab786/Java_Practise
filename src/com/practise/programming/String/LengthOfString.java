package com.practise.programming.String;

public class LengthOfString {
    public static int getLength(String str){
        int length=0;
        for(char c:str.toCharArray()){
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(getLength("john wick"));
    }
}
