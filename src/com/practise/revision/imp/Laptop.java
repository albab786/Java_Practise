package com.practise.revision.imp;

public class Laptop {
    double price;
    String comp_name;

    public Laptop(double price, String comp_name) {
        this.price = price;
        this.comp_name = comp_name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", comp_name='" + comp_name + '\'' +
                '}';
    }
}
