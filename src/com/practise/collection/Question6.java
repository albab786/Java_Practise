package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Question6 {
    public static void main(String[] args) {
        Collection c1=new ArrayList<>();
        c1.add("khabib");
        c1.add(11);
        c1.add(45.87);
        c1.add(99);
        c1.add(78);
        c1.add(9);
        c1.add(true);
        c1.add('@');
        c1.add('#');
        Iterator itr =c1.iterator();
        int max=0;
        int min=Integer.MAX_VALUE;
        while (itr.hasNext()){
            Object o=itr.next();
            if (o instanceof Integer){
                max=Math.max(max,(Integer)o);
                min=Math.min(min,(Integer)o);
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
