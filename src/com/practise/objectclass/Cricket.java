package com.practise.objectclass;

public class Cricket {
    String temas;
    int noOfPlayers;

    public static void main(String[] args) {
        Cricket c1=new Cricket();
        Cricket c2=new Cricket();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
