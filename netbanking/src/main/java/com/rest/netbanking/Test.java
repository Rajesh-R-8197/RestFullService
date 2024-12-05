package com.rest.netbanking;

public class Test implements Bank{
    @Override
    public void sum(int a) {
        System.out.println("sum");
    }

    @Override
    public void multiply(int a, long b) {
        System.out.println("sum");
    }
}
