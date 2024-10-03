package com.practise.java8;

@FunctionalInterface
interface MyinterfaceTwo{
    public void m2();

}
public class LambdaExpression1 {
    public static void main(String[] args) {
        MyinterfaceTwo lambdaExpression = () -> System.out.println("lambda expression");
        lambdaExpression.m2();
    }
}
