package com.exercise.calculator.model;

public class OtherCalculation {

    public double squareOf(int a) {
        return Math.sqrt(a);
    }

    public double cubeOf(int a) {
        return Math.cbrt(a);
    }

    public String showAsBinary(long a){
        StringBuilder binary = new StringBuilder();
        while(a!=0){
            if (a%2==0){
                binary = binary.append(0);
            }
            else{
                binary = binary.append(1);
            }
            a/=2;
        }
        return binary.reverse().toString();
    }


    public int factorial(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }
}
