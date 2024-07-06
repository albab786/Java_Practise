package com.practise.oops.variableHiding;

public class Account {
    static int amount=500;
    String acType="SAVING";
    void show(){
        String acType="CURRENT";
        System.out.println(acType);
    }

    public static void main(String[] args) {

        int amount=900;
        System.out.println(amount);
        Account ac=new Account();
        ac.show();

    }
}
