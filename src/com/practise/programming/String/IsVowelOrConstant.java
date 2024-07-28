package com.practise.programming.String;

public class IsVowelOrConstant {
    public static void checkVowelOrConstant(char c){
        if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||c=='A' ||c=='E'||c=='I'||c=='O'||c=='U')
            System.out.println("vowel");
        else{
            System.out.println("constant");
        }
    }
    public static void main(String[] args) {
        checkVowelOrConstant('m');
    }
}
