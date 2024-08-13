package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Question9 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList<>();
        c1.add("khabib");
        c1.add(111);
        c1.add(7);
        c1.add(99);
        c1.add(785);
        c1.add(19);
        c1.add(true);
        c1.add('@');
        c1.add('#');
        Iterator itr = c1.iterator();
        int count=0;
        while (itr.hasNext()) {
            Object o = itr.next();
            if (o instanceof Integer) {
               if( isPrime((Integer)o)) {
                   System.out.println(o);
                   count++;
               }
            }
        }
        System.out.println("total digit count which is prime"+ "   "+count);
    }
    public static boolean isPrime(int n){
        int i=2;
        while (i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
