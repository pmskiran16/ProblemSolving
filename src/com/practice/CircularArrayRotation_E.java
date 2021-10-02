package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation_E {
    public static void main(String[] args) {
        System.out.println(circularArrayRotation(Arrays.asList(1, 2, 3), 2, Arrays.asList(0, 1, 2)));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        final List<Integer> result = new ArrayList<>();
        final int size = a.size();
        queries.forEach(i -> {
            int index = ((size-(k%size)) + i)%size;
            result.add(a.get(index));
        });

        return result;
    }
}
