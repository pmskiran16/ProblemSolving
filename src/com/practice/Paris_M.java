package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Paris_M {
    public static void main(String[] args) {
        System.out.println(pairs(2, Arrays.asList(1, 5, 3, 4, 2)));
    }


    //Others Solution, no time limit exceeds.
    public static int pairs(int k, List<Integer> arr) {
        int result = 0;
        int i = 0 , j =1;

        Collections.sort(arr);

        while(j < arr.size()) {
            if(arr.get(j) - arr.get(i) == k) {
                i++;
                result++;
            } else if(arr.get(j) - arr.get(i) < k) {
                j++;
            } else if(arr.get(j) - arr.get(i) > k) {
                i++;
                j++;
            }
        }

        return result;
    }

    //Solution 2, 1 test case failed with time limit.
    public static int pairs_2(int k, List<Integer> arr) {
        // Write your code here
        int result = 0;
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++) {
            int tempLimt = (i+k+1) > arr.size() ? arr.size() : (i+k+1);
            for(int j=i+1; j < tempLimt; j++) {
                if(arr.get(j) - arr.get(i) == k) {
                    result++;
                    break;
                }

            }
        }

        return result;
    }

    //solution 1, 5 test cases failed with time limit.
    public static int pairs_1(int k, List<Integer> arr) {
        // Write your code here
        int result = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.contains(arr.get(i) + k))
                result++;
        }

        return result;
    }


}
