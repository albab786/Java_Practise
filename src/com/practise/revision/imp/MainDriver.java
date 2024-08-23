package com.practise.revision.imp;

public class MainDriver {
    public static void main(String[] args) {
        MyAcceseries myAcceseries=new MyAcceseries(new Laptop(767565,"lenovo"),new Car(9897877,"audi"),new Watch(1156564,"titan"));

        System.out.println(myAcceseries);

    }


}
