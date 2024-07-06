package com.practise.oops.objectinitilazation;

public class Student {
    int roll_no;
    String name;
    String branch_name;
    public void setValues(int r,String n,String b){
        roll_no=r;
        name=n;
        branch_name=b;
    }
    public void display(){
        System.out.println("Name is"+ " " +name);
        System.out.println("roll No is "+ " " +roll_no);
        System.out.println("branch name is"+ " " + branch_name);
    }
}
