package com.practice.dynamicprogramming;

import java.util.ArrayList;

public class TravellingSalesMan {
    static int graph[][] = { { 0, 10, 15, 20 },
            { 10, 0, 35, 25 },
            { 15, 35, 0, 30 },
            { 20, 25, 30, 0 } };

    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();
        path.add(0);
        findShortestPath(0, path, 0);
    }

    private static void findShortestPath(int pathValue, ArrayList<Integer> path, int index) {
        if(path.size() == graph[0].length) {
            path.forEach((Integer i) -> System.out.print(i));
            System.out.print(" --> "+pathValue);
            System.out.println();
            return;
        }

        for(int i=index; i<graph[0].length; i++) {
            for(int j=0; j<graph[0].length; j++) {
                int tempPathValue = 0;
                ArrayList<Integer> tempPath = new ArrayList<>();
                if(i!=j && !path.contains(j)) {
                    tempPathValue = pathValue + graph[i][j];
                    tempPath.addAll(path);
                    tempPath.add(j);
                    findShortestPath(tempPathValue, tempPath, j);
                }
            }
        }
    }
}
