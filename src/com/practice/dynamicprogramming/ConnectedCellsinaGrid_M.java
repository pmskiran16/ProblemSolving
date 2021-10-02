package com.practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConnectedCellsinaGrid_M {

    private static List<Index> regionlist = new ArrayList<>();
    private static List<Index> tempRegionList = new ArrayList<>();
    private static int[][] mainMatrix = {{0,0,1,1}, {0,0,1,0}, {0,1,1,0}, {0,1,0,0}, {1,1,0,0}};
//    private static int[][] mainMatrix = {{1,1,0}, {1,0,0}, {0,0,1}};
//    private static int[][] mainMatrix;
    private static int rowCnt, colCnt;

    public static void main(String[] args) {
        rowCnt = mainMatrix.length;
        colCnt = mainMatrix[0].length;
        System.out.println(connectedCell(null));
    }

    public static int connectedCell(List<List<Integer>> matrix) {
        // Write your code here
//        rowCnt = matrix.size();
//        colCnt = matrix.get(0).size();
//        mainMatrix = new int[rowCnt][colCnt];
//        for(int i=0; i<rowCnt; i++) {
//            for(int j=0; j<colCnt; j++) {
//                mainMatrix[i][j] = matrix.get(i).get(j);
//            }
//        }

        for(int i = 0; i<rowCnt; i++) {
            for(int j = 0; j<colCnt; j++) {
                if(mainMatrix[i][j] == 1 && !regionlist.contains(new Index(i, j))) {
                    findRegion(i, j);
                    if(regionlist.size() < tempRegionList.size()) {
                        regionlist.clear();
                        regionlist.addAll(tempRegionList);
                    }
                    tempRegionList.clear();
                }
            }
        }

//        regionlist.forEach(i -> System.out.println("("+i.row+","+i.column+")"));
        return regionlist.size();
    }


    private static void findRegion(int row, int col) {
        if(tempRegionList.contains(new Index(row, col))) {
            return;
        } else {
            tempRegionList.add(new Index(row, col));
        }

        if(col < colCnt-1 && mainMatrix[row][col+1] == 1) {
            findRegion(row, col+1);
        }
        if(col < colCnt-1 && row < rowCnt-1 && mainMatrix[row+1][col+1] == 1) {
            findRegion(row+1, col+1);
        }
        if(row < rowCnt-1 && mainMatrix[row+1][col] == 1){
            findRegion(row+1, col);
        }
        if(row < rowCnt-1 && col > 0 && mainMatrix[row+1][col-1] == 1) {
            findRegion(row+1, col-1);
        }
        if(col > 0 && mainMatrix[row][col-1] == 1) {
            findRegion(row, col-1);
        }
        if(row > 0 && mainMatrix[row-1][col] == 1) {
            findRegion(row-1, col);
        }
        if(row > 0 && col > 0 && mainMatrix[row-1][col-1] == 1) {
            findRegion(row-1, col-1);
        }
        if(row > 0 && col < colCnt-1 && mainMatrix[row-1][col+1] == 1) {
            findRegion(row-1, col+1);
        }

    }

    private static class Index {
        int row, column;

        public Index(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Index index = (Index) o;
            return row == index.row &&
                    column == index.column;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column);
        }
    }
}
