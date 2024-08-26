package com.practise.collection;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add(007);
        l.add("james bond");
        l.add("x-men");
        l.add(false);
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
