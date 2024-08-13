package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class question2 {
    public static void main(String[] args) {
        Collection c1=new ArrayList<>();
        c1.add("khabib");
        c1.add(11);
        c1.add(45.87);
        c1.add(98);
        c1.add(true);
        c1.add('@');
        c1.add(66);
        c1.add('#');
        Iterator itr =c1.iterator();
        while (itr.hasNext()){
            Object o=itr.next();
            if( o instanceof Integer)
            System.out.print(o +" ");
        }
    }
}
