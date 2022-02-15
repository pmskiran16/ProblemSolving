package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank_MatrixLayerRotation_H {
    static int arr[][];
//    = new int[][]{
//            {1,2,3,4},
//            {5, 6, 7, 8},
//            {9,10,11,12},
//            {13, 14, 15, 16}
//            };
    public static void main(String[] args) {

//        List<List<Integer>> matrix = new ArrayList<>();
//        int row = matrix.size();
//        int col = matrix.get(0).size();
//        arr = new int[row][col];
//        for(int i=0; i< row; i++)
//            for(int j=0; j< col; j++) {
//                arr[i][j] = matrix.get(i).get(j);
//            }
//
//        List<List<Index>> layers = getLayers(arr);
//
//        layers.stream().forEach(e -> {
//            updateLayerDate(e, 1);
//        });
//
//        Arrays.stream(arr).forEach(arr1 ->{
//            Arrays.stream(arr1).forEach(e ->System.out.print(e+" "));
//            System.out.println();
//        });
    }

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int row = matrix.size();
        int col = matrix.get(0).size();
        arr = new int[row][col];
        for(int i=0; i< row; i++)
            for(int j=0; j< col; j++) {
                arr[i][j] = matrix.get(i).get(j);
            }

        List<List<Index>> layers = getLayers(arr);

        layers.stream().forEach(e -> {
            updateLayerDate(e, r);
        });

        Arrays.stream(arr).forEach(arr1 ->{
            Arrays.stream(arr1).forEach(e ->System.out.print(e+" "));
            System.out.println();
        });
    }

    private static void updateLayerDate(List<Index> indexList, int r) {
        int layerData[] = getLayerData(indexList);
        int rotationCnt = r % layerData.length;

        Index start = indexList.get(0);
        Index end = indexList.get(1);

        int a = start.row, b = start.col;
        boolean increment = true;

        for(int i=0; i<layerData.length; i++) {

            arr[a][b] = layerData[(i+rotationCnt)%layerData.length];

            if(b<end.col-1 && increment){
                b++;
            } else if(a<end.row-1 && increment) {
                a++;
                if(a == end.row-1)
                    increment = false;
            } else if(b>start.col && !increment) {
                b--;
            } else {
                a--;
            }
        }
    }

    private static int[] getLayerData(List<Index> indexList) {
        Index start = indexList.get(0);
        Index end = indexList.get(1);
        int[] result = new int[(2*(end.row-start.row))+(2*(end.col-start.col))-4];

        int a = start.row, b = start.col;
        boolean increment = true;

        for(int i=0; i<result.length; i++) {
            result[i] = arr[a][b];

            if(b<end.col-1 && increment){
                b++;
            } else if(a<end.row-1 && increment) {
                a++;
                if(a == end.row-1)
                    increment = false;
            } else if(b>start.col && !increment) {
                b--;
            } else {
                a--;
            }
        }

        return result;
    }

    private static List<List<Index>> getLayers(int[][] arr) {
        List<List<Index>> resultIndex = new ArrayList<>();

        int row = arr.length;
        int col = arr[0].length;
        int min = (row<col)?(row/2):(col/2);

        for (int i=0; i<min; i++) {
            List<Index> tempIndex = new ArrayList<>();
            Index start = new Index(i, i);
            Index end = new Index(row-i, col-i);
            tempIndex.add(start);
            tempIndex.add(end);
            resultIndex.add(tempIndex);
        }

        return resultIndex;
    }

    private static class Index {
        int row, col;

        public Index(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
