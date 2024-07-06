package com.practise.basic.switchstatement;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 1000;

        while (true) {
            System.out.println("Enter 1 to know your balance, 2 to deposit, 3 to withdraw, 4 to go back to the main menu, 5 to exit: ");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Your balance is: " + amount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    amount += deposit;
                    System.out.println("New balance: " + amount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    int withdraw_amount = sc.nextInt();
                    if (withdraw_amount > amount) {
                        System.out.println("Insufficient balance.");
                    } else {
                        amount -= withdraw_amount;
                        System.out.println("New balance: " + amount);
                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
