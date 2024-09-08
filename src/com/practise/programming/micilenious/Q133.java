package com.practise.programming.micilenious;



public class Q133 {
    public static String getReverseWord(String s){
        String ans = "";
        String manp = "";


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                ans += getReverse(manp) + " "; // Add a space after the reversed word
                manp = ""; // Reset the word accumulator
            } else {
                manp += s.charAt(i); // Keep building the current word
            }
        }

        // Reverse and add the final word (after the loop ends)
        ans += getReverse(manp);

        return ans;
    }
    public static String getReverse(String s){
        String rev="";
        for (int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return  rev;
    }
    public static void main(String[] args) {
        String a="PRINCE IS GOOD SINGER";
        System.out.println(getReverseWord(a));
    }
}
