package com.practise.oops;

public class ConstructorChaining {

    String name;
    int age;
    String school_Name;
    int roll_No;
    int standard;
    public ConstructorChaining(String name){
        this.name=name;
    }
    public ConstructorChaining(String name,int age,String school_Name){
        this.name=name;
        this.age=age;
        this.school_Name=school_Name;
    }
    public ConstructorChaining(String name,int age,String school_Name,int roll_No,int standard){

        this(name,age,school_Name);
        this.roll_No=roll_No;
        this.standard=standard;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(school_Name);
        System.out.println(roll_No);
        System.out.println(standard);
    }

    public static void main(String[] args) {

        ConstructorChaining c=new ConstructorChaining("john");
        c.display();
        ConstructorChaining ob=new ConstructorChaining("wick",24,"sjs",27,10);
        ob.display();
    }
}
