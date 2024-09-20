package com.practise.collection.customsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> li=new ArrayList<>();
        li.add(new Student(11,"john wick",7));
        li.add(new Student(2,"john snow",9));
        li.add(new Student(9,"lucifer",1));
        li.add(new Student(1,"berlin",2));
        for (Student s:li){
            System.out.println(s);

        }
        System.out.println("===========================================");
        Collections.sort(li,new StudentRollComprator());
        for (Student s:li){
            System.out.println(s);

        }
    }
}
