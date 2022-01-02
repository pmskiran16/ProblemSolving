package com.practice;

import sun.plugin.dom.core.CoreConstants;

import java.util.*;
import java.util.stream.Collectors;

public class KnightLOnAChesBoard {

    private static int indexes[][] = {{1, 1}, {-1, 1}, {1, -1}, {-1, -1}};
    private static List<Coordiante> coordianteList = new ArrayList<>();
    private static List<Coordiante> validCoordianteList = new ArrayList<>();
    private static int [][] matrix;
    private static int [][] resultMatrix;
    private static int size;
    private static HashMap<Coordiante, List<Coordiante>> tempList = new HashMap<>();

    public static void main(String[] args) {

        int n = 25;
        matrix = new int[n][n];
        resultMatrix = new int[n-1][n-1];
        Arrays.stream(matrix).forEach(e -> Arrays.fill(e, Integer.MAX_VALUE));
        Arrays.stream(resultMatrix).forEach(e -> Arrays.fill(e, Integer.MAX_VALUE));
        long time1 = System.currentTimeMillis();
        List<List<Integer>> resultList = knightlOnAChessboard(n);
        System.out.println("Time lapsed :: "+ (System.currentTimeMillis() - time1));
    }

    /*
     * Complete the 'knightlOnAChessboard' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */
    public static List<List<Integer>> knightlOnAChessboard(int n) {
        // Write your code here
        List<List<Integer>> resultList;
        size = n;

        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                Arrays.stream(matrix).forEach(e -> Arrays.fill(e, Integer.MAX_VALUE));
                matrix[0][0] = 0;
                tempList.clear();
                pathCnt(new Coordiante(0, 0), new Coordiante(i, j),
                        getValidCoordinates(new Coordiante(0, 0), new Coordiante(i, j)));
            }
        }

        resultList = Arrays.stream(resultMatrix).map(e -> {
            return Arrays.stream(e).map(i -> {
                if(i == Integer.MAX_VALUE)
                    return -1;
                else return i ;
            }).boxed().collect(Collectors.toList());
        }).collect(Collectors.toList());

        return resultList;
    }

    private static void pathCnt(Coordiante currentNode, Coordiante c, List<Coordiante> pathList) {

        if(currentNode.x == size-1 && currentNode.y == size-1)
            return;

        int pathListSize = pathList.size();
        for(int i=0; i<pathListSize; i++) {
            if(matrix[currentNode.x][currentNode.y] + 1 < matrix[pathList.get(i).x][pathList.get(i).y]) {
                matrix[pathList.get(i).x][pathList.get(i).y] = matrix[currentNode.x][currentNode.y] + 1;
                pathCnt(pathList.get(i), c, getValidCoordinates(pathList.get(i), c));
                if(resultMatrix[c.x-1][c.y-1] > matrix[size-1][size-1])
                    resultMatrix[c.x-1][c.y-1] = matrix[size-1][size-1];
            }
        }

        return;
    }

    private static List<Coordiante> getValidCoordinates(Coordiante currentNode, Coordiante node) {
        coordianteList.clear();

        if(tempList.containsKey(currentNode))
            return tempList.get(currentNode);

        coordianteList.addAll(validCoordinates(currentNode, node));
//        if(node.x != node.y)
        coordianteList.addAll(validCoordinates(currentNode, node.swap()));

        tempList.put(currentNode, coordianteList.stream().distinct().collect(Collectors.toList()));

        return tempList.get(currentNode);
    }

    private static List<Coordiante> validCoordinates(Coordiante currentNode, Coordiante node) {
        validCoordianteList.clear();
        Arrays.stream(indexes).forEach(cooridante -> {
            int x = currentNode.x + cooridante[0] * node.x;
            int y = currentNode.y + cooridante[1] * node.y;
            if((x >=0 && x < size) && (y >=0 && y < size)) {
                validCoordianteList.add(new Coordiante(x, y));
            }
        });

        return validCoordianteList;
    }

    private static class Coordiante {
        public int x, y;

        public Coordiante(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Coordiante swap() {
            int temp = x;
            x = y;
            y = temp;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coordiante that = (Coordiante) o;
            return x == that.x &&
                    y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "("+x+","+y+")";
        }
    }

}
