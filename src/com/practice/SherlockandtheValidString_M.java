package com.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class SherlockandtheValidString_M {
    public static void main(String[] args) {
        System.out.println(isValid("aabb"));
    }

    public static String isValid(String s) {
        // Write your code here
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        s.chars().forEach(i -> {
            if(resultMap.containsKey(i)) {
                resultMap.put(i, resultMap.get(i)+1);
            } else {
                resultMap.put(i, 1);
            }
        });

        HashMap<Integer, Integer> resultMapValues = new HashMap<>();
        resultMap.values().stream().forEach(i -> {
            if(resultMapValues.containsKey(i)) {
                resultMapValues.put(i, resultMapValues.get(i)+1);
            } else {
                resultMapValues.put(i, 1);
            }
        });

        if(resultMapValues.size() == 1) return "YES";
        if(resultMapValues.size() > 2) return "NO";
        List<Integer> resultList = resultMapValues.keySet().stream().sorted().collect(Collectors.toList());
        if(resultList.size() > 0 && resultList.get(0) == 1 && resultMapValues.get(resultList.get(0)) == 1) return "YES";
        if(resultList.size() > 0 && resultMapValues.get(resultList.get(resultList.size()-1)) > 1) return "NO";
        if(resultList.size() > 0 && resultList.get(0)+1 != resultList.get(resultList.size()-1)) return "NO";

        return "YES";
    }
}
