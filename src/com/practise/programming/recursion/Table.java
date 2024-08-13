package com.practise.programming.recursion;

public class Table {

    public static void getTable(int n,int j){
        if (j > 10) {
            return;
        }

        System.out.println(n + " * " + j + " = " + (n * j));
        getTable(n,j+1);
    }

    public static void main(String[] args) {
        getTable(5,1);
    }
}
