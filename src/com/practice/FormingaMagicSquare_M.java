package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FormingaMagicSquare_M {

    private static int minDiff = -1;
    private static int[] input = new int[9];

    public static void main(String[] args) {
//        System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(4, 8, 2), Arrays.asList(4, 5, 7), Arrays.asList(6, 1, 6))));
        System.out.println(formingMagicSquare(Arrays.asList(Arrays.asList(1, 3, 8), Arrays.asList(6, 4, 1), Arrays.asList(2, 6, 5))));
//        combinations(new StringBuilder());
    }

    public static int formingMagicSquare(List<List<Integer>> s) {

        for(int i = 0, k = 0; i < s.size(); i++)
            for(int j = 0; j< s.get(i).size(); j++) {
                input[k++] = s.get(i).get(j);
            }

        combinations(new StringBuilder());
        return minDiff;
    }

    private static void combinations(StringBuilder stringBuilder) {
        if(stringBuilder.length() == 9) {
            if(isValidMatrix(stringBuilder.toString())) {
//                System.out.println(stringBuilder.toString());
                int diff = findDiff(stringBuilder.toString());
                if(minDiff > diff || minDiff == -1) {
                    minDiff = diff;
                }
            }
            return;
        }

        for(int i = 1; i <= 9; i++) {
            if(!stringBuilder.toString().contains(""+i))
                combinations(new StringBuilder(stringBuilder).append(i));
        }
    }

    private static boolean isValidMatrix(String data) {
        String[] values = data.split("");
        int[][] arr = new int[3][3];

        for(int i = 0, k = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(values[k++]);
            }
        }

        int expectedValue = (arr[0][0]+arr[1][1]+arr[2][2]);
        //Check diagonals.
        if(expectedValue != (arr[0][2]+arr[1][1]+arr[2][0])) {
            return false;
        }

        //Check rows.
        for(int i = 0; i < arr.length; i++) {
            if(expectedValue != (arr[i][0]+arr[i][1]+arr[i][2]))
                return false;
        }

        //Check columns.
        for(int j = 0; j < arr[0].length; j++) {
            if(expectedValue != (arr[0][j]+arr[1][j]+arr[2][j]))
                return false;
        }

        return true;
    }

    private static int findDiff(String data) {
        int[] combination = Stream.of(data.split("")).mapToInt(Integer::parseInt).toArray();

        int diff = 0;
        for (int i = 0; i < combination.length; i++) {
            diff += getDelta(combination[i], input[i]);
        }

        return diff;
    }

    private static int getDelta(int i, int j) {
        if(i < j) {
            return j - i;
        } else if(j < i) {
            return i - j;
        } else {
            return 0;
        }
    }

}
