package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheBomberGame {
    public static void main(String args[]) {
        List<String> grid = Arrays.asList(new String[]{".......", "...O.O.", "....O..", "..O....", "OO...OO", "OO.O..."});

        System.out.println("Grid input-->");
        printGrid(grid);

        System.out.println("Grid output-->");
        printGrid(bomberMan(5, grid));
    }
    private static void printGrid(List<String> grid) {
        for (String str: grid) {
            System.out.println(str);
        }
    }

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        List<String> updatedGrid = secondState(grid);
        List<String> updatedGrid_1 = secondState(updatedGrid);

        if(n==1)
            return grid;

        if(n%2 == 0) {
            return fillGrid(grid);
        } else {
            if((n/2) % 2 == 0)
                return updatedGrid_1;
            else
                return updatedGrid;
        }
    }

    private static List<String> secondState(List<String> grid) {

        List<String> resultGrid = fillGrid(new ArrayList<>(grid));

        for (int i = 0; i<grid.size(); i++) {
            String tempString = grid.get(i);
            for(int j = 0; j < tempString.length(); j++) {
                if(tempString.charAt(j) == 'O') {
                    char[] charArray = resultGrid.get(i).toCharArray();
                    charArray[j] = '.';

                    if(j>0) {
                        charArray[j-1] = '.';
                    }
                    if(j+1 < tempString.length()) {
                        charArray[j+1] = '.';
                    }
                    resultGrid.set(i, new String(charArray));

                    if(i > 0) {
                        char[] tempArray = resultGrid.get(i-1).toCharArray();
                        tempArray[j] = '.';
                        resultGrid.set(i-1, new String(tempArray));
                    }

                    if(i+1 <grid.size()) {
                        char[] tempArray = resultGrid.get(i+1).toCharArray();
                        tempArray[j] = '.';
                        resultGrid.set(i+1, new String(tempArray));
                    }
                }
            }
        }

        return resultGrid;
    }

    private static List<String> fillGrid(List<String> grid) {
        for(int i=0; i<grid.size(); i++) {
            String tempString = grid.get(i);
            char[] charArray = tempString.toCharArray();
            Arrays.fill(charArray, 'O');
            grid.set(i, new String(charArray));
        }
        return grid;
    }
}
