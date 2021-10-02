package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PossiblePairs {
    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        pairCombinations("", list);
    }

    private static int pairCombinations(String preFix, List<Integer> list) {
        int result = 0;

        if(preFix.length() == 2) {
            return Integer.parseInt(preFix);
        }


        for(int i=0; i<list.size(); i++) {
            int currentValue = list.get(i);
            list.remove(i);
            int tempResult = pairCombinations(""+preFix+currentValue, list);

            System.out.println(tempResult);
        }
        return result;
    }
}
