package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Question5 {
    public static void main(String[] args) {
        Collection c1=new ArrayList<>();
        c1.add("khabib");
        c1.add(11);
        c1.add(45.87);
        c1.add("Hamza");
        c1.add("john john");
        c1.add(true);
        c1.add('@');
        c1.add("MMA UFC");
        c1.add('#');
        Iterator itr =c1.iterator();
        String s="";
        String l="";
        int count=0;
        while (itr.hasNext()){
            Object o=itr.next();
            if(o instanceof String){
                String temp=(String)o;
                count++;
                if (count==1){
                    s=(String)o;
                    l=(String)o;
                }
                if(temp.length()>l.length()){
                    l=temp;
                }
                if(temp.length()<s.length()){
                    s=temp;
                }
            }
        }
        System.out.println("smallest is"+  " "+ s);
        System.out.println("largest is"+" "+ l);
    }
}
