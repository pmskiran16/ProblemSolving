package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountOfPairsInList {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(countPairsWithOutDuplicate(list, 10));
    }

    private static int countPairsWithOutDuplicate(List<Integer> list, int requiredSum) {
        int result = 0;
        HashMap<Integer, Boolean> resultMap = new HashMap<>();

        for(int i=0; i<list.size(); i++) {
            if(resultMap.containsKey(list.get(i)) && !resultMap.get(list.get(i)).booleanValue()) {
                resultMap.put(list.get(i), true);
                result++;
            } else {
                resultMap.put(requiredSum-list.get(i), false);
            }
        }

        return result;
    }
}
