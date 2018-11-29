package com.exercise.calculator.model;

public class OtherCalculation {

    public double squareOf(int a) {
        return Math.sqrt(a);
    }

//    public double cubeOf(int a) {
//        return Math.cbrt(a);
//    }

    public int factorial(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }
}
