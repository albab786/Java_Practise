package com.practise.oops.encapsulation;

public class Employ {
    private String name;
    private double salary;
    private long id;

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setId(Long id){
        this.id=id;
    }
}
