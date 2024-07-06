package com.practise.dynamic_method_dispatch;


    public class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }



