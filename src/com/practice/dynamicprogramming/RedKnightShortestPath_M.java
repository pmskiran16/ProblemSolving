package com.practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RedKnightShortestPath_M {

    private static int actual_indexes[][] = {{-2,-1}, {-2,1}, {0,2}, {2,1}, {2,-1}, {0,-2}};
    private static String actual_indexes_str[] = {"UL", "UR", "R", "LR", "LL", "L"};
    private static List<int[]> indexes = new ArrayList<>();
    private static List<String> indexes_str = new ArrayList<>();
    private static StringBuilder result = null;
    private static List<int[]> visitedIndexes = new ArrayList<>();

    public static void main(String[] args) {
        printShortestPath(100, 2, 24, 92, 45);

        if(result == null)
            System.out.println("Impossible");
        else {
            System.out.println(result.toString().split(" ").length);
            System.out.println(result.toString().trim());
        }
    }

    public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        if(i_end <= i_start) {
            //Upper part
//            if(j_end == i_start) {
                indexes.add(actual_indexes[0]);
                indexes.add(actual_indexes[1]);
                indexes.add(actual_indexes[2]);
                indexes.add(actual_indexes[5]);
                indexes_str.add(actual_indexes_str[0]);
                indexes_str.add(actual_indexes_str[1]);
                indexes_str.add(actual_indexes_str[2]);
                indexes_str.add(actual_indexes_str[5]);
            /*}else if(j_end <= j_start) {
                //Left part
                indexes.add(actual_indexes[0]);
                indexes.add(actual_indexes[5]);
                indexes_str.add(actual_indexes_str[0]);
                indexes_str.add(actual_indexes_str[5]);
            } else {
                //Right
                indexes.add(actual_indexes[1]);
                indexes.add(actual_indexes[2]);
                indexes_str.add(actual_indexes_str[1]);
                indexes_str.add(actual_indexes_str[2]);
            }*/
        } else {
            //Lower part
//            if(j_end == j_start) {
                indexes.add(actual_indexes[2]);
                indexes.add(actual_indexes[3]);
                indexes_str.add(actual_indexes_str[2]);
                indexes_str.add(actual_indexes_str[3]);
                indexes.add(actual_indexes[4]);
                indexes.add(actual_indexes[5]);
                indexes_str.add(actual_indexes_str[4]);
                indexes_str.add(actual_indexes_str[5]);
            /*} else if(j_end <= j_start) {
                //Left part
                indexes.add(actual_indexes[4]);
                indexes.add(actual_indexes[5]);
                indexes_str.add(actual_indexes_str[4]);
                indexes_str.add(actual_indexes_str[5]);
            } else {
                //Right
                indexes.add(actual_indexes[2]);
                indexes.add(actual_indexes[3]);
                indexes_str.add(actual_indexes_str[2]);
                indexes_str.add(actual_indexes_str[3]);
            }*/
        }

        printShortestPath_1(n, i_start, j_start, i_end, j_end, new StringBuilder());
    }

    public static void printShortestPath_1(int n, int i_start, int j_start, int i_end, int j_end, StringBuilder strb) {

        if(i_start == i_end && j_start == j_end) {
            if(result == null || result.length() > strb.length())
                result = strb;
            return;
        }

        for(int i = 0; i<indexes.size(); i++) {
            int temp_i = i_start+indexes.get(i)[0];
            int temp_j = j_start+indexes.get(i)[1];
            if(!isIndexVisited(temp_i, temp_j, i_end, j_end) && !(temp_i < 0 || temp_j < 0 || temp_i > n-1 || temp_j > n-1)){
                int temp[] = new int[]{temp_i, temp_j};
                System.out.println(temp_i+ " - "+ temp_j);
                visitedIndexes.add(temp);
                printShortestPath_1(n, temp_i, temp_j, i_end, j_end,
                        new StringBuilder(strb).append(indexes_str.get(i)+" "));
//                visitedIndexes.remove(temp);
            }
        }
    }

    private static boolean isIndexVisited(int i, int j, int k, int l) {
        if(i==k && j==l)
            return false;

        for(int m=0; m<visitedIndexes.size(); m++) {
            if(visitedIndexes.get(m)[0] == i && visitedIndexes.get(m)[1] == j)
                return true;
        }

        return false;
    }
}
