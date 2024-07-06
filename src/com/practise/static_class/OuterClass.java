package com.practise.static_class;

public class OuterClass {
    private static String staticOuterField = "Static Field in Outer Class";
    private String instanceOuterField = "Instance Field in Outer Class";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Can access static members of the outer class
            System.out.println("Static Outer Field: " + staticOuterField);

            // Cannot access instance members of the outer class directly
            // System.out.println("Instance Outer Field: " + instanceOuterField); // This would cause an error
        }
    }

    // Inner class (non-static nested class)
    public class InnerClass {
        public void display() {
            // Can access both static and instance members of the outer class
            System.out.println("Static Outer Field: " + staticOuterField);
            System.out.println("Instance Outer Field: " + instanceOuterField);
        }
    }

    public static void main(String[] args) {
        // Instantiate static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();

        // Instantiate inner class
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
