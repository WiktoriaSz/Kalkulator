package com.exercise.calculator.model;

public class SimpleCalculation {

    public int add(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public double division(int a, int b) {

        return (double) a / b;
    }

    public double modulo(int a, int b) {

        return a % b;
    }

    public double powerOf(int a, int b) {
        return Math.pow((double) a, (double) b);
    }

    public double percentOf(int a, int b){
        return ((double)a/100)*b;
    }
}
