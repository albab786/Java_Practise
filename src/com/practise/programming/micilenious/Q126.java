package com.practise.programming.micilenious;

public class Q126 {
    //126.WAP TO COUNT THE CHARACTERS PRESENT IN STRINGWITHOUT USINGLENGTH().
    public static int getLength(String str){
        int count=0;
        char[] charArray = str.toCharArray();
        for (char c:charArray){
            count++;
        }
        return count;
    }
    public static int getLength2(String str){
        int count=0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        }
            catch(Exception e){
                System.out.println(e.getMessage());

            }
        return count;
        }




    public static void main(String[] args) {
        System.out.println(getLength2("qwerty"));
    }
}

