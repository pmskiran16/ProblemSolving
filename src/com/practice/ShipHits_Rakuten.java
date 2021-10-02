package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShipHits_Rakuten {

    private static int EMPTY = 0;
    private static int SHIP = 1;
    private static int BOMB = 2;

    private static int ROW = 5;
    private static int COLUMN = 5;

    public static void main(String args[]) {
        List<String> shipList = Arrays.asList(new String[]{"0A,1B", "3A,3A", "2B,2D", "3B,3B"});
        List<String> bombList = Arrays.asList(new String[]{"0A", "0B", "1A", "1B", "3A", "2B"});

        int gameBoard[][] = new int[ROW][COLUMN];
        gameBoard = updateBomb(gameBoard, bombList);
        List<String> resultList =getResultList(gameBoard, shipList);

        resultList.forEach(System.out::println);
    }

    private static int[][] updateBomb(int[][] gameBoard, List<String> bombList) {
        bombList.stream().forEach(bomb -> {
            int[] indexes = getIndex(bomb);
            gameBoard[indexes[0]][indexes[1]] = BOMB;
        });

        return gameBoard;
    }

    private static List<String> getResultList(int[][] gameBoard, List<String> shipList) {
        List<String> resultList = new ArrayList<>();

        shipList.forEach(ship -> {
            String[] indexesStr = ship.split(",");
            int[] startIndexes = getIndex(indexesStr[0]);
            int[] endIndexes = getIndex(indexesStr[1]);

            boolean bombImpact = false;
            boolean fullyImpacted = true;
            for(int i = startIndexes[0]; i <= endIndexes[0]; i++) {
                for(int j = startIndexes[1]; j <= endIndexes[1]; j++) {
                    if(gameBoard[i][j] == BOMB) {
                        bombImpact = true;
                    } else {
                        fullyImpacted = false;
                    }
                }
            }

            if(fullyImpacted) {
                resultList.add("Ship sunk.");
            }else if(bombImpact){
                resultList.add("Bomb impact");
            } else {
                resultList.add("No impact");
            }
        });

        return resultList;
    }

    private static int[] getIndex(String str) {
        int[] indexes = new int[2];
        indexes[0] = Integer.parseInt(str.substring(0, str.length()-1));
        indexes[1] = str.charAt(str.length()-1) - 'A';
//        System.out.println("Row:"+indexes[0]+" Column:"+indexes[1]);
        return indexes;
    }
}
