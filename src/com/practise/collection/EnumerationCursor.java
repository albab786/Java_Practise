package com.practise.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add("do it now");
        v.add('@');
        v.add(1234.986);
        v.add(true);
        Enumeration elements = v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
