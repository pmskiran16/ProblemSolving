package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers_E {
    public static void main(String[] args) {

        closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854)).forEach(System.out::print);
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        int minDiff = -1;

        Collections.sort(arr);

        minDiff = arr.get(1) - arr.get(0);
        resultList.add(arr.get(0));
        resultList.add(arr.get(1));

        int tempDiff = 0;
        for(int i = 1; i < arr.size()-1; i++) {
            tempDiff = arr.get(i+1) - arr.get(i);
            if(tempDiff < minDiff) {
                resultList.clear();
                minDiff = tempDiff;
                resultList.add(arr.get(i));
                resultList.add(arr.get(i+1));
            } else if(tempDiff == minDiff) {
                resultList.add(arr.get(i));
                resultList.add(arr.get(i+1));
            }
        }
        return resultList;
    }
}
