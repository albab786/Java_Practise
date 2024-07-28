package com.practise.basic.switchstatement;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a=sc.nextInt();
        System.out.println("Enter first second");
        int b=sc.nextInt();
        System.out.println("Enter airthmetic operation perform");
        char c=sc.next().charAt(0);

        switch (c) {

            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a*b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            default:
                System.out.println("you have entered wrong ");
        }

    }
}
