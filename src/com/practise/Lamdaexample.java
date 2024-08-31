package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Lamdaexample {

    private String name;
    private String age;
    private String Salary;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

//    private Lamdaexample populateData() {
//
//    }


    public Lamdaexample(String name, String age, String salary, String designation) {
        this.name = name;
        this.age = age;
        Salary = salary;
        this.designation = designation;
    }

    public Lamdaexample() {

    }

    @Override
    public String toString() {
        return "Lamdaexample{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Salary='" + Salary + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Lamdaexample lamdaexample = new Lamdaexample("Peter", "16", "1300", "SW");
        Lamdaexample lamdaexample2 = new Lamdaexample("john", "26", "2700", "sW");
        Lamdaexample lamdaexample3 = new Lamdaexample("snow", "26", "1000", "sW");
//
//
//        List<Lamdaexample> data1 = new ArrayList<>();
//        data1.add(lamdaexample);
//        data1.add(lamdaexample2);
//        data1.add(lamdaexample3);
//
//
//        data1.stream().map(o -> {
//            Integer sal = Integer.parseInt(o.getSalary());
//            if (sal >= 1300) {
//                o.setDesignation("Manager");
//            }
//            return o;
//        }).forEach(System.out::println);

//        List<String> myList = Arrays.asList("Abid","Albab","Anam","Kaif","Hasnain");
//
//
//
//
//       List<String> myNewList = myList.stream().filter(aName->aName.startsWith("A"))
//               .map(o->o.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
//        ArrayList<String> ans=new ArrayList<>();
//
////        myList.stream().forEach(System.out::print);
//        for (String my : myList){
//            if(my.startsWith("A")){
//                ans.add(my);
//
//            }
//        }
//        System.out.println(myNewList);
//    }
    }
}
