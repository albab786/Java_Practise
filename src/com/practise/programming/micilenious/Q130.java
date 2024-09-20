package com.practise.programming.micilenious;

public class Q130 {
    //WAP TO FIND THE OCCURANCE OF EACH CHARACTER IN A STRING.
    public static void getOccurence(String s){
        int[] freq = new int[s.length()];



        char string[] = s.toCharArray();
        for(int i = 0; i <s.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <s.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }
        //Displays the each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(int i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }

    public static void main(String[] args) {
        getOccurence("abbbcddg");
    }

    }
