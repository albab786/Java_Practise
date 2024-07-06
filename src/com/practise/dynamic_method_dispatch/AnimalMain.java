package com.practise.dynamic_method_dispatch;

public class AnimalMain {
        public static void main(String[] args) {
            Animal myAnimal;
            myAnimal = new Dog();
            myAnimal.sound(); // Outputs: Dog barks

            myAnimal = new Cat();
            myAnimal.sound(); // Outputs: Cat meows
        }
    }