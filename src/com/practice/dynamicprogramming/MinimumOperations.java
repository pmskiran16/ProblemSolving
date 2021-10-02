package com.practice.dynamicprogramming;

public class MinimumOperations {

    public static void main(String[] args) {
        System.out.println("Result :: "+minOperations(7));
    }

    private static int minOperations(int value) {
        if(value == 1)
            return 1;

        if(value%2 == 0)
            return 1 + minOperations(value/2);
        else
            return 2 + minOperations(value/2);
    }
}