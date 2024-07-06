package com.practise.typeCasting;

public class Main {
    public static void main(String[] args) {
        //upcasting
        //Benefits of Upcasting
        //Polymorphism: Upcasting allows for the use of polymorphism, where a superclass
        // reference can refer to a subclass object.
        // This enables writing more flexible and reusable code.
        //Code Flexibility: It allows for designing generic algorithms and data structures
        // that can operate on objects of different classes as long as they share a common superclass.
//        Father f=new Son();
//        f.show();
//        Father e=new Father();
//        e=new Daughter();
//        e.show();

        // Upcasting: Father reference to Son object
        Father f = new Son();
        f.show();  // Outputs: Son's show()

        // Another upcasting example: Father reference to Daughter object
        Father e = new Daughter();
        e.show();  // Outputs: Daughter's show()
//downcasting
        Son s=(Son)f;
        s.show();

    }
}
