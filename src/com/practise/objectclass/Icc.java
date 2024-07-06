package com.practise.objectclass;

public class Icc {
    int NoOfTeams;
    String Sname;
    public int hashCode(){
        return 9000;
    }

    public static void main(String[] args) {
        Icc t=new Icc();
        Icc t2=new Icc();
        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());
    }


}
