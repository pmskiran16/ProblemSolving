package com.practice.dynamicprogramming;

import java.util.*;

/*
* Need to check my HackerRank Comments. Implementation is working fine in local env(Java 8) but not in HackerRank env(Java 8). Strange issue.
* */
public class CountLuck_M {

    private static char[][] arr;
    private static String[] indexes = {"0,1", "1,0", "0,-1", "-1,0"};
    private static List<Index> indexList = new ArrayList<>();
    private static int cnt = 0;

    public static void main(String[] args) {
        System.out.println(countLuck(Arrays.asList(".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX."), 4));
    }

    public static String countLuck(List<String> matrix, int k) {
        // Write your code here
        Index sourceIndex = null;
        arr = new char[matrix.size()][matrix.get(0).length()];
        for(int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < matrix.get(i).length(); j++) {
                arr[i][j] = matrix.get(i).charAt(j);
                if(arr[i][j] == 'M') {
                    sourceIndex = new Index(i, j);
                }
            }
        }

        findPath(sourceIndex, new ArrayList<Index>());
        System.out.println("Cnt :: "+cnt);
        return cnt==k ? "Impressed" : "Oops!";
    }

    public static void findPath(Index index, List<Index> tempIndexList) {
        if(arr[index.row][index.col] == '*') {
            if(indexList.size() == 0 || indexList.size() > tempIndexList.size())
                indexList = tempIndexList;
            return;
        }

        int tempCnt = 0;
        for(int i =0; i<indexes.length; i++) {
            Index tempIndex = new Index(indexes[i]);
            int tempRow = (index.row + tempIndex.row) > 0 ? (index.row + tempIndex.row) : 0;
            tempRow = tempRow > arr.length-1 ? arr.length-1 : tempRow;
            int tempCol = (index.col + tempIndex.col) > 0 ? (index.col + tempIndex.col) : 0;
            tempCol = tempCol > arr[0].length-1 ? arr[0].length-1 : tempCol;

            if((arr[tempRow][tempCol] == '.' || arr[tempRow][tempCol] == '*') && !tempIndexList.contains(new Index(tempRow, tempCol))) {
                List<Index> newIndexList = new ArrayList<>(tempIndexList);
                Index newIndex = new Index(tempRow, tempCol);
                newIndexList.add(newIndex);
                tempCnt+=1;
                findPath(newIndex, newIndexList);
            }
        }
        cnt +=((tempCnt>0)?(tempCnt-1):0);
    }

    private static class Index {
        int row, col;

        public Index(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public Index(String str) {
            String[] indexes = str.split(",");
            this.row = Integer.parseInt(indexes[0]);
            this.col = Integer.parseInt(indexes[1]);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Index index = (Index) o;
            return row == index.row &&
                    col == index.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "[" + row + ", " + col + ']';
        }
    }
}
