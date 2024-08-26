package com.practise.revision;

public class BankAccount {
    double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void withDraw(double amount) throws InsufficientFundsException{
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds the current balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        try {
            account.withDraw(1200.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
