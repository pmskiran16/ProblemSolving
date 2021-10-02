package com.practice.dynamicprogramming;

public class LongestIncreasingSequence {

    private static final int[] arr = {10, 9, 2, 5, 3, 7, 8, 101, 18};
//    private static final int[] arr = {10, 9, 2, 5, 3, 7, 11, 101, 16};
    private static String resultString = "";
    private static int maxLength = 0;

    public static void main(String[] args) {
        getSequence(new StringBuilder(), 0);
        System.out.println(resultString);
    }

    private static void getSequence(StringBuilder str, int index) {
        if(index == arr.length) {
            return;
        }

        for(int i = index; i< arr.length; i++) {
            StringBuilder tempString = new StringBuilder(str);
            String[] strArr = tempString.toString().split(",");

            if((strArr.length > 1 && (Integer.parseInt(strArr[strArr.length-1]) - Integer.parseInt(strArr[strArr.length-2])) <
                    arr[i] - Integer.parseInt(strArr[strArr.length-1]))
                    || (strArr.length == 1 && !strArr[0].isEmpty() && arr[i] > Integer.parseInt(strArr[0]))
                    || (strArr.length == 1 && strArr[0].isEmpty() )) {
                getSequence(new StringBuilder(str).append(arr[i]+","), i+1);
            }

            System.out.println(str);
            if(str.toString().split(",").length > maxLength) {
                resultString = str.toString();
                maxLength = str.toString().split(",").length;
            }
        }
    }
}
