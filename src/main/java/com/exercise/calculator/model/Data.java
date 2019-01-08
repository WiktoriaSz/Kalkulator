package com.exercise.calculator.model;

public class Data {

    private int a;
    private int b;

    public Data() {
    }

    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Data(int a){
        this.a = a;
        this.b = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
