package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheGridSearch {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String args[]) {
        List<String> grid = Arrays.asList(new String[]{"999999",
                "121211"
                });
        List<String> pattern = Arrays.asList(new String[]{"99",
                "11"});

        System.out.println("Pattern Search :: "+gridSearch(grid, pattern));
    }

    private static String gridSearch(List<String> G, List<String> P) {
        String result = NO;

        for(int i = 0; i < G.size(); i++) {
            String pString = P.get(0);
            String gString = G.get(i);
            int tempIndex = 0;
            if(gString.contains(pString)) {
                List<Integer> startIndex = new ArrayList<>();
                while(gString.indexOf(pString, tempIndex) > -1) {
                    startIndex.add(gString.indexOf(pString, tempIndex));
                    tempIndex = gString.indexOf(pString, tempIndex) + 1;
                }
                if(patternSearch(G, P, startIndex, i).equals(YES))
                    return YES;
            }
        }

        return result;
    }

    private static String patternSearch(List<String> G, List<String> P, List<Integer> startIndex, int row) {
        // Write your code here
        List<Integer> matchStartIndex = startIndex;
        int matchPatternRow = 1;
        boolean sameIndex = false;

        for(int j = row+1; j < G.size(); j++) {
            String pString = P.get(matchPatternRow);
            String gString = G.get(j);
            List<Integer> tempMatchStartIndex = new ArrayList<Integer>();

            if(gString.contains(pString)) {
                int tempIndex = 0;

                while(true) {
                    if(gString.indexOf(pString, tempIndex) > -1 && matchStartIndex.contains(gString.indexOf(pString, tempIndex))) {
                            tempMatchStartIndex.add(gString.indexOf(pString, tempIndex));
                            tempIndex = gString.indexOf(pString, tempIndex) + 1;
                            sameIndex = true;
                    } else {
                        break;
                    }
                }

                if(!sameIndex) {
                    return NO;
                }

                matchPatternRow+=1;
                if(P.size() == matchPatternRow) {
                    return YES;
                }

                matchStartIndex = tempMatchStartIndex;
                sameIndex = false;
//                matchStartIndex.forEach(System.out::println);
//                System.out.println("matchPatternRow :: "+matchPatternRow);
            } else {
                return NO;
            }
        }

        return NO;
    }
}
