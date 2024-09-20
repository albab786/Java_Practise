package com.practise.programming.micilenious;

public class Q129 {
    //129.FIND THE DUPLICATE CHARACTER PRESENT IN THE STRING.
    public static void getDublicate(String str){
        for (int i=0;i<str.length();i++){
            for (int j=i+1;i<str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    System.out.println("dublicate character is " +str.charAt(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        getDublicate("applee");
    }

}
