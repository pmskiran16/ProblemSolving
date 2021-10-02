package com.practice;

import java.util.Arrays;

public class MinDiffPairs {
    public static void main(String[] args) {
        System.out.println(getMinDiffPairs(new int[]{4,2,1,3}));
    }

    public static String getMinDiffPairs(int[] A) {
        Arrays.sort(A);
        StringBuilder strb = new StringBuilder();
        int minDiff = A[1]-A[0];
        int i=0, j=1;
        while(i != j && j<A.length) {

            if(A[j] - A[i] > minDiff) {
                j++;
                i++;
            } else if(A[j] - A[i] < minDiff) {
                minDiff = A[j] - A[i];
                strb.delete(0, strb.length());
                strb.append("["+i+","+j+"]");
                if(i+1 == j) {
                    i++;
                    j++;
                }else{
                    i++;
                }
            }else {
                strb.append("["+A[i]+","+A[j]+"]");
                i++;
                j++;
            }
        }

        return strb.toString();
    }
}
