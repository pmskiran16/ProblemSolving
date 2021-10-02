package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        System.out.println(new MinAbsoluteDiff().solution(new int[]{-8, 4, 5, -10, 3}));
    }

    public int solution(int[] A) {
        Arrays.sort(A);

        int ans = Math.abs(A[0] * 2);
        int start = 0, end=A.length-1;

        while(start<end) {
            ans = Math.min(ans, Math.abs(A[start]+A[start]));
            ans = Math.min(ans, Math.abs(A[end] + A[end]));
            ans = Math.min(ans, Math.abs(A[start] + A[end]));

            if(ans == 0)
                return 0;
            else if(A[start] + A[end] > 0) {
                end--;
            } else {
                start++;
            }

            if((A[start]<0 && A[end]<0) || (A[start]>0 && A[end]>0)) {
                return ans;
            }
        }
        return ans;
    }

    public int solution_1(int[] A) {
        List<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(list);

        int firstPositiveIndex = 0;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        int i=firstPositiveIndex-1, j = firstPositiveIndex;
        int tempResult = 0;

        while (i >= 0) {
            int temp;
            while(j < list.size()) {
                temp = list.get(j) + list.get(i);
                temp = (temp<0)?-temp:temp;

                if(tempResult > temp || tempResult == 0) {
                    tempResult = temp;
                    j++;
                } else {
                    break;
                }
            }
            i--;
        }

//        System.out.println("TempResult ::"+tempResult);

        /*int tempResult = 0;
        int temp;
        int i=firstPositiveIndex-1, j = firstPositiveIndex;
        while(i>=0 || j<list.size()-1) {
            temp = list.get(i) + list.get(j);
            temp = (temp<0)?-temp:temp;

            if(tempResult == 0 || tempResult > temp) {
                if(j < list.size()-2)
                    j++;
                tempResult = temp;
            } else {
                if(i>0)
                    i--;
            }
        }*/

        //System.out.println("TempResult :: "+tempResult);
        return 0;
    }
}
