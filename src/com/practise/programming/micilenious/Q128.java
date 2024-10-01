package com.practise.programming.micilenious;

public class Q128 {
    public static String lToUppercase(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                ans += (char)(ch - 32);  // Convert to uppercase
            } else {
                ans += ch;  // Keep character as is if it's not a lowercase letter
            }
        }
        return ans;  // Return the result
    }

    public static void main(String[] args) {

    }

}

