package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItrDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("GOT");
        c.add(187);
        c.add("GREEK");

        c.add('@');
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
