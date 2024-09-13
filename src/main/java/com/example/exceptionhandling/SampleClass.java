package com.example.exceptionhandling;

    public class SampleClass {
        public static void main(String[] args) {
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                String str = null;
                System.out.println(str.length());
                System.out.println("Null Pointer Exception Caught");
            } finally {
                System.out.println("Finally Block");
            }
        }
    }

