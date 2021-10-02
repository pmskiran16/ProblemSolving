package com.practice.dynamicprogramming;

public class MatrixLetToBottom {
    static int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int rowCnt = 2;
    static int colCnt = 2;

    public static void main(String[] args) {

        leftToBottom(0, 0, new StringBuilder());
    }

    private static void leftToBottom(int i, int j, StringBuilder path) {
        if(i == rowCnt && j == colCnt) {
            path.append("("+i+","+j+")");
            System.out.println(path);
        }

        if(i != rowCnt)
            leftToBottom(i+1, j, new StringBuilder().append(path.toString()).append("("+i+","+j+")"));
        if(j != colCnt)
            leftToBottom(i, j+1, new StringBuilder().append(path.toString()).append("("+i+","+j+")"));
    }
}
