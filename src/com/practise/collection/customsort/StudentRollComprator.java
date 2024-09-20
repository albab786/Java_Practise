package com.practise.collection.customsort;

import java.util.Comparator;

public class StudentRollComprator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll_no-o2.roll_no;
    }
}
