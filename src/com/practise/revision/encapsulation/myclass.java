package com.practise.revision.encapsulation;

public class myclass {
    public static void test(int a)
    {
        if(a>100)
        {
            System.out.println("Eligible for ticket");
        }
        else
        {
            try {
                throw new MyException("you are not");
            } catch (MyException e) {
                System.out.println(e.msg);
            }
        }
    }

    public static void main(String[] args) {
        test(80);
    }
}
