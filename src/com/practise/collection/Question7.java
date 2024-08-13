package com.practise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Question7 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList<>();
        c1.add("khabib");
        c1.add(111);
        c1.add(45.87);
        c1.add(99);
        c1.add(785);
        c1.add(900);
        c1.add(true);
        c1.add('@');
        c1.add('#');
        Iterator itr = c1.iterator();
        int count_with_three_digit=0;
        while (itr.hasNext()) {
            Object o = itr.next();
            if (o instanceof Integer) {
                int count=getDigitCount((Integer)o);
                if (count==3){
                    count_with_three_digit++;
                    System.out.println(o);
                }
            }
        }
        System.out.println("total digit count with three digit is"+ "   "+count_with_three_digit);
    }
    public static int getDigitCount(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
            }
