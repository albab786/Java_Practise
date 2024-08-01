package com.practise.revision;

public class Student extends ParentDetails{
    String student_name;
    String standard;
    Student(String student_name,String standard,String name, String address){
        super(name,address);
        this.student_name=student_name;
        this.standard=standard;

    }

    public static void main(String[] args) {
        Student s1=new Student("john","xiii","abc","us");
        System.out.println(s1.student_name);
        s1.dis();
    }
}
