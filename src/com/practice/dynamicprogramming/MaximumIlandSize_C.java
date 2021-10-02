package com.practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumIlandSize_C {

    private static StringBuilder resultString = new StringBuilder();
    private static List<String> resultList = new ArrayList<>();
    private static String[] indexes = {"0,1", "1,1", "1,0", "1,-1", "-1,0", "-1,-1", "-1,0", "-1,1"};
    private static int ilandLength = 0;
    private static int arr[][];
    private static int rowCnt, colCnt;

    public static void main(String[] args) {
        System.out.println(maximumIslandSize(Arrays.asList("1101", "1101", "0000", "1011")));
    }

    public static int maximumIslandSize(List<String> matrix) {
        // Write your code here
        arr = new int[matrix.size()][matrix.get(0).length()];
        rowCnt = matrix.size();
        colCnt = matrix.get(0).length();

        for (int i =0 ; i<rowCnt; i++) {
            for(int j =0; j<colCnt; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(matrix.get(i).charAt(j)));
            }
        }

        for (int i =0 ; i<rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                if(arr[i][j] == 1 && !isIndexAdd(i, j)) {
                    resultString.delete(0, resultString.toString().length());
                    findIlandSize(i, j);
                    resultList.add(resultString.toString());
                }
            }
        }

        findLinkIndex();
        return ilandLength;
    }

    private static void findIlandSize(int r, int c) {
        if(!resultString.toString().contains("("+r+","+c+")")) {
            resultString.append("("+r+","+c+") ");
        }

        if(r+1 < rowCnt && arr[r+1][c] == 1 && !resultString.toString().contains("("+(r+1)+","+c+")")) {
            findIlandSize(r+1, c);
        } else if(r+1 < rowCnt && c+1 < colCnt && arr[r+1][c+1] == 1 && !resultString.toString().contains("("+(r+1)+","+(c+1)+")")) {
            findIlandSize(r+1, c+1);
        } else if(c+1 < colCnt && arr[r][c+1] == 1 && !resultString.toString().contains("("+(r)+","+(c+1)+")")) {
            findIlandSize(r, c+1);
        } else if(r+1 < rowCnt && c-1 >= 0 && arr[r+1][c-1] == 1 && !resultString.toString().contains("("+(r+1)+","+(c-1)+")")) {
            findIlandSize(r+1, c-1);
        } else if(c-1 >= 0 && arr[r][c-1] == 1 && !resultString.toString().contains("("+(r)+","+(c-1)+")")) {
            findIlandSize(r, c-1);
        } else if(r-1 >= 0 && c-1 >= 0 && arr[r-1][c-1] == 1 && !resultString.toString().contains("("+(r-1)+","+(c-1)+")")) {
            findIlandSize(r-1, c-1);
        } else if(r-1 >= 0 && arr[r-1][c] == 1 && !resultString.toString().contains("("+(r-1)+","+(c)+")")) {
            findIlandSize(r-1, c);
        } else if(r-1 >= 0 && c+1 < colCnt && arr[r-1][c+1] == 1 && !resultString.toString().contains("("+(r-1)+","+(c+1)+")")) {
            findIlandSize(r-1, c+1);
        }

    }

    private static void findLinkIndex() {
        for(int i=0; i< resultList.size(); i++) {
            for(int j=i+1; j<resultList.size(); j++) {
                int tempLenght = isConnectedwithLength(i, j);
                if(tempLenght > ilandLength)
                    ilandLength = tempLenght;
            }
        }
    }

    private static int isConnectedwithLength(int a, int b) {
        String[] arr_1 = resultList.get(a).split(" ");
        String[] arr_2 = resultList.get(b).split(" ");

        for(int i = 0; i<arr_1.length; i++) {
            String temp = arr_1[i];
            temp = temp.replace("(", "");
            temp = temp.replace(")", "");

            String index[] = temp.split(",");

            for(int j = 0; j<arr_2.length; j++) {
                String temp_1 = arr_2[j];
                temp_1 = temp_1.replace("(", "");
                temp_1 = temp_1.replace(")","");
                String index_1[] = temp_1.split(",");

                if(getDelta(index[0], index_1[0]) + getDelta(index[1], index_1[1]) == 2) {
                    return arr_1.length + arr_2.length;
                }
            }
        }

        return 0;
    }

    private static boolean isIndexAdd(int a, int b) {

        for(int i=0; i<resultList.size(); i++) {
            if(resultList.get(i).contains("("+a+","+b+")")) {
                return true;
            }
        }

        return false;
    }

    private static int getDelta(String str1, String str2) {
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        return (a-b)>0 ? (a-b) : (b-a);
    }
}
