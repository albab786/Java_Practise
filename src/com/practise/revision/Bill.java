package com.practise.revision;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    long bill_id;
    String coustomer_name;
    double price;

    public Bill(long bill_id, String coustomer_name, double price) {
        this.bill_id = bill_id;
        this.coustomer_name = coustomer_name;
        this.price = price;
    }

    public String toString() {
        return "bill id is" + " " + bill_id + " " + "price is" + " " + price + "   " + "coustomer name is" + " " + coustomer_name;
    }


    public Bill() {

    }

    public static void main(String[] args) {
        Bill b1 = new Bill(1, "john wick", 9898);
        Bill b2 = new Bill(2, "john snow", 9898);
        Bill b3 = new Bill(3, "merphy", 9898908);
        Bill b4 = new Bill(4, "peter parker", 9897798);
        List<Bill> bills = new ArrayList<>();
        bills.add(b1);
        bills.add(b2);
        bills.add(b3);
        bills.add(b4);
        for (Bill b : bills) {
            System.out.println(b.toString());
        }

    }

}
