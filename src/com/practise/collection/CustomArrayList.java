package com.practise.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomArrayList<T> {
    Object[] elements;
    int size=0;
    static final int DEFAULT_CAPACITY = 10;
    public CustomArrayList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public void add(T element){
        if(size==DEFAULT_CAPACITY){
            resizeArray();
        }
        elements[size++] = element;
    }
    public void resizeArray(){
        int newCapacity = elements.length * 2;
        elements= Arrays.copyOf(elements,newCapacity);
    }

    public static void main(String[] args) {
        CustomArrayList<String> ss=new CustomArrayList<>();
        ss.add("GOT");
        ss.add("Harry Potter");
        ss.add("Witcher");
        System.out.println(ss);

    }


}
