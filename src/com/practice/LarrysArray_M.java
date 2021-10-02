package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LarrysArray_M {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String args[]) {
        System.out.println(larrysArray(Arrays.asList(3, 2, 1, 4)));
    }

    public static String larrysArray(List<Integer> A) {
        // Write your code here
        for(int i = 0; i < A.size()-2 ; i++) {
            for(int j = 0; j<A.size()-2-i; j++) {
                int[] temp = getNumberSequence(new int[]{A.get(j), A.get(j+1), A.get(j+2)});
                A.set(j, temp[0]);
                A.set(j+1, temp[1]);
                A.set(j+2, temp[2]);
            }
        }

        if(A.equals(Arrays.asList(A.stream().sorted().toArray()))) {
            return YES;
        } else {
            return NO;
        }
    }

    private static int[] getNumberSequence(int[] arr) {
        int result[] = new int[3];
        if(arr[2]>arr[0] && arr[2]>arr[1]) {
            return arr;
        } else if(arr[1] > arr[2] && arr[1] > arr[0]) {
                result[0] = arr[2];
                result[1] = arr[0];
                result[2] = arr[1];
        } else if(arr[0] > arr[2] && arr[0] > arr[1]) {
                result[0] = arr[1];
                result[1] = arr[2];
                result[2] = arr[0];
        }

        return result;
    }

/*
    // Others solution.
    static String larrysArray_(int[] A) {
        int ret = 0;
        for(int i = 0; i < A.length; ++i) {
            for(int j = i + 1; j < A.length; ++j) {
                ret += A[i] > A[j] ? 1 : 0;
                ret %= 2;
            }
        }
        return ret == 0 ? "YES" : "NO";
    }
 */
}
