package com.practise.revision;

class Calculator {

    int num;

    public Calculator(int num) {
        this.num = num;
    }

    public Calculator() {

    }

    public int sumOfDigits(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return sum;
    }


    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sumOfDigits(1234));
        System.out.println();

    }
}
