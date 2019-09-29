package com.learn.written_test;

public class TestClass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((TestClass)null).testMethod();
    }
}
