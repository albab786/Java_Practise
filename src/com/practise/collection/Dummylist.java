package com.practise.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Dummylist {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add("john snow");
        list.add("john wick");
        list.add(11);
        list.add(45.78);
        //iterating through for each loop
//      for(Object obj:list){
//          System.out.println(obj);
//      }
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

    }
}
