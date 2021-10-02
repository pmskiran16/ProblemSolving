package com.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MissingInteger_codility {
    public static void main(String[] args) {
        findMissingInteger(new int[]{-1, -2});
    }

    private static int findMissingInteger(int[] A) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] > 0) {
                sortedSet.add(A[i]);
            }
        }

        int temp = 1;
        Iterator<Integer> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            if(temp != iterator.next().intValue())
                break;
            temp++;
        }

        System.out.println(temp);
        return temp;
    }
}
