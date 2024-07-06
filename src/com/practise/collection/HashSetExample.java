package com.practise.collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Apple");
        
        // Attempt to add a duplicate element
//        boolean isAdded = set.add("Apple"); // This will return false because "Apple" is already in the set
        
        // Print the result of adding a duplicate element
//        System.out.println("Was 'Apple' added again? " + isAdded); // Outputs: false

        // Checking if an element is in the set
//        boolean containsBanana = set.contains("Banana");
//        System.out.println("Does the set contain 'Banana'? " + containsBanana); // Outputs: true

        // Removing an element
//        set.remove("Date");

        // Checking the size of the HashSet
//        System.out.println("Size of the set: " + set.size()); // Outputs: 3

        // Iterating over the elements in the HashSet
        System.out.println("Elements in the set:");
        for (String item : set) {
            System.out.println(item);
        }


    }
}
