package com.practise.basic.switchstatement;

public class Choose {
    public static void main(String[] args) {
        int n=2;

        switch (n){
            case 1:
                System.out.println("yes");
                break;
            case 2:
                System.out.println("No");
                break;
            case 3:
                System.out.println("cant say");
                break;
            default:
                System.out.println("erooor");
        }
    }
}
