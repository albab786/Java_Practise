package com.practise.programming.String;

public class RemoveSpaces {
    public static String removeSpace(String str){
        String ans="";
        for(int i=-0;i<str.length();i++){
            if (str.charAt(i)==' '){
                continue;
            }
            ans=ans+str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeSpace("do it now"));
    }
}
