package com.practise.collection.customsort;

public class Student {
    int roll_no;
    String name;
    int class_no;

    public Student() {

    }

    public Student(int roll_no, String name, int class_no) {
        this.roll_no = roll_no;
        this.name = name;
        this.class_no = class_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", class_no=" + class_no +
                '}';
    }
}
