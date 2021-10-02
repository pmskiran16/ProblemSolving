package com.practice;

import java.util.*;

public class ManasaandStones_E {
    public static void main(String[] args) {
        stones(4, 10, 100);
    }

    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        Set<Integer> resultSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            resultSet.add((n-1-i)*a + i*b);
        }

        List<Integer> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);

        resultList.stream().forEach(System.out::println);

        return resultList;
    }
}
