package com.company;

public class Main {

    public static void main(String[] args) {
        Complex complex;
        ConcreteFactory concreteFactory = new ConcreteFactory();

        complex = concreteFactory.createComplex();
        System.out.println(complex);

        complex = concreteFactory.createComplex(2, 2);
        System.out.println(complex);

        complex = concreteFactory.createComplex(2, -2);
        System.out.println(complex);
    }
}
