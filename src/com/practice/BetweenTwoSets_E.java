package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class BetweenTwoSets_E {
    public static void main(String args[]) {

        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        System.out.println("Result : "+getTotalX(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0;
        int lcm = LCM_of_list(a);
        int gcd = GCD_of_list(b);

        for(int i = lcm; i <= gcd; i+=lcm) {
            if(gcd%i == 0)
                result++;
        }

        return result;
    }

    private static int LCM_of_list(List<Integer> list) {
        return list.stream().reduce((partialResult, i) -> LCM(partialResult, i)).get();
    }

    private static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }

    private static int GCD_of_list(List<Integer> list) {
        return list.stream().reduce((partialResult, i)-> GCD(partialResult, i)).get();
    }

    private static int GCD (int a, int b) {
        if(a == 0)
            return  b;
        return GCD(b%a, a);
    }
}
