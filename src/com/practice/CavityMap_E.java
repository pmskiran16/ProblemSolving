package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap_E {
    public static void main(String[] args) {

//        cavityMap(Arrays.asList("1112", "1912", "1892", "1234")).forEach(System.out::println);
        cavityMap(Arrays.asList("99", "11")).forEach(System.out::println);

    }

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        if(grid.size() == 1 || grid.size() ==2) {
            return grid;
        }

        for(int i=1; i<grid.size()-1; i++) {
            StringBuilder tempStr = new StringBuilder(grid.get(i));

            for(int j=1; j<tempStr.length()-1; j++) {
                /*if((tempStr.charAt(j-1) != 'X' && tempStr.charAt(j-1) < tempStr.charAt(j)) &&
                        (tempStr.charAt(j+1) != 'X' && tempStr.charAt(j+1) < tempStr.charAt(j)) &&
                        (grid.get(i-1).charAt(j) != 'X' && grid.get(i-1).charAt(j) < tempStr.charAt(j)) &&
                        (grid.get(i+1).charAt(j) != 'X' && grid.get(i+1).charAt(j) < tempStr.charAt(j))) {*/
                if(tempStr.charAt(j-1) < tempStr.charAt(j) &&
                        tempStr.charAt(j+1) < tempStr.charAt(j) &&
                        grid.get(i-1).charAt(j) < tempStr.charAt(j) &&
                        grid.get(i+1).charAt(j) < tempStr.charAt(j)) {
                    tempStr.setCharAt(j, 'X');
                }
            }
            grid.set(i, tempStr.toString());
        }

        return grid;
    }
}
