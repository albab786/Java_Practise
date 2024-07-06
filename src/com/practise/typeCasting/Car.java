package com.practise.typeCasting;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car car = new Car("Red");
        Car c1 = new Car("black");
        System.out.println(c1 instanceof Car);


        // Using instanceof to check if car is an instance of Car
        if (car instanceof Car) {
            System.out.println("car is an instance of Car");
        } else {
            System.out.println("car is not an instance of Car");
        }
    }
}
