package com.practise.programming.String;

public class Alphabet {
    public static boolean checkAlphabet(char c){
        if(c>=65 && c<=90 || c>=97 && c<=122){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkAlphabet('1'));
    }
}
