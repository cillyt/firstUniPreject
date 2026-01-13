package org.example;

public class Equals {
    public static void main(String[] args) {
        String n1 = new String("hello");
        String n2 = new String("hello");
        System.out.println("1. hello == hello " + (n1 == n2));
        System.out.println("2. hello equals hello " + n1.equals(n2));

        for(int i = -128; i<=128; i++){
            Integer i1 = i;
            Integer i2 = i;
            System.out.println("1. " + i + " == " + i + " " + (i1==i2));
            System.out.println("2. " + i + " equals " + i + " " + (i1.equals(i2)));
        }

    }
}
