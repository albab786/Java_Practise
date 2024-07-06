package com.practise.patternprinting;

public class StarPattern {
    public static void squareStarPattern(int n){
        //for row
        for(int i=1;i<=n;i++){
            //for column
            for(int j=1;j<=n;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hollowSquareStarPattern(int n){
        //for row
        for(int i=1;i<=n;i++){
            //for column
            for(int j=1;j<=n;j++ ) {
                //for hollow space
                if (i > 1 && i<n  && j>1 && j<n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void  rhombusStarPattern(int n){
        //for row
        for(int i=1;i<=n;i++){
            //for space
            for(int s=2;s<=i;s++){
                System.out.print(" ");
            }
            //for column
            for(int j=1;j<=n;j++ ){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void mirroredRhombusStarPattern(int n){
        //for row
        for(int i=1;i<=n;i++){
            //for space
            for(int s=i;s<n;s++){
                System.out.print(" ");
            }
            //for column
            for(int j=1;j<=n;j++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleStarPattern(int n){
        //for rows
        for(int i=1;i<=n;i++){

            //for column
            for(int j=1;j<=i;j++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        squareStarPattern(5);
//        hollowSquareStarPattern(5);
//        rhombusStarPattern(5);
//        mirroredRhombusStarPattern(4);
//        triangleStarPattern(5);
    }
}
