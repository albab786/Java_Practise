package com.practise.objectclass;

import java.util.Objects;

public class Laptop {
    String name;
    String companyName;
    double price;

    public Laptop(String name, String companyName, double price) {

        this.name = name;
        this.companyName = companyName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(price, laptop.price) == 0 && Objects.equals(name, laptop.name) && Objects.equals(companyName, laptop.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, companyName, price);
    }
}
