package com.practise.patternprinting;

public class NumberPattern {
    public static void numberSquarePattern(int n){
        //for rows
        for(int i=1;i<=n;i++){

            //for column
            for(int j=1;j<=n;j++ ){

                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberSquarePattern(5);
    }
}
