package com.practise.programming.String;

public class ToggleCharacter {
    public static String getToggle(String s){
        String ans="";
        for (int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                ans+=Character.toLowerCase(s.charAt(i));
            else
            ans+=Character.toUpperCase(s.charAt(i));
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(getToggle("khAbIB Numergadov"));
    }
}
