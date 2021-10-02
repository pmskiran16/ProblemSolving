package com.practice;

import java.util.ArrayList;

public class Tiles {

    private static int adjRow[] = {0, -1, 0, 1};
    private static int adjCol[] = {-1, 0, 1, 0};

    public static void main(String args[]) {

    }


    private static ArrayList<Location> findAdjLoc(Location forLocation) {
        ArrayList<Location> adjLocations = new ArrayList<>();

        for(int i=0; i<4; i++) {
            if(forLocation.row + adjRow[i] > 0 && forLocation.column + adjCol[i] > 0) {
                Location tempLocation = new Location();
                tempLocation.row = forLocation.row + adjRow[i];
                tempLocation.column = forLocation.column + adjCol[i];
                adjLocations.add(tempLocation);
            }
        }

        return adjLocations;
    }

    private static ArrayList<ArrayList<Location>> findPath(Location targetLoc) {

        ArrayList<ArrayList<Location>> pathToTargetLocation = new ArrayList<>();
        ArrayList<Location> adjcentLocations = findAdjLoc(targetLoc);


        return pathToTargetLocation;
    }


    private static class Location {
        int row;
        int column;
    }
}
