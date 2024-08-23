package com.practise.revision.imp;

public class Watch {
    double price;
    String comp_name;

    @Override
    public String toString() {
        return "Watch{" +
                "price=" + price +
                ", comp_name='" + comp_name + '\'' +
                '}';
    }

    public Watch(double price, String comp_name) {
        this.price = price;
        this.comp_name = comp_name;
    }
}
