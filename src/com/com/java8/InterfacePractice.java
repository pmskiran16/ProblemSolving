package com.com.java8;

public class InterfacePractice implements i{
    public static void main(String args[]) {

        j.staticPrint();
    }
}

interface i {
    int i=10;

    default void print() {
        System.out.println("i::print");
    }

    static void staticPrint() {
        System.out.println("i::staticPrint");
    }
}

interface j {
    default void print() {
        System.out.println("j::print");
    }

    static void staticPrint() {
        System.out.println("j::staticPrint");
    }
}

