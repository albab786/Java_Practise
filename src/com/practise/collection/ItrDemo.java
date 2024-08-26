package com.practise.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItrDemo {
    public static void main(String[] args) {
        List l=new ArrayList<>();
        l.add(12);
        l.add("john wick");
        l.add(007);
        l.add("GOT");
        ListIterator itr = l.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
