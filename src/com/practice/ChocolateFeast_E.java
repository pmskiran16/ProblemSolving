package com.practice;

public class ChocolateFeast_E {
    public static void main(String[] args) {
        chocolateFeast(6, 2, 2);
    }

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here

        int barCnt = n/c, wrapperCnt = n/c;

        while(wrapperCnt >= m) {
            barCnt += wrapperCnt / m;
            wrapperCnt = wrapperCnt / m + wrapperCnt % m;
        }

        System.out.println("Bar Cnt :: "+barCnt);
        return barCnt;
    }

}
