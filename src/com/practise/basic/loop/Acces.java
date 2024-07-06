package com.practise.basic.loop;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Acces {

    public static <ChangeFinalVariable> void main(String[] args) throws Exception{

        Chagefinalvariable instance = new Chagefinalvariable();
        System.out.println("Before: " + instance.finalVar);

        // Get the Field object for the final variable
        Field field = Chagefinalvariable.class.getDeclaredField("finalVar");

        // Make the field accessible
        field.setAccessible(true);

        // Remove the final modifier from the field
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);

        // Set the new value for the final variable
        field.set(instance, 20);
        System.out.println("After: " + instance.finalVar);

    }
}
