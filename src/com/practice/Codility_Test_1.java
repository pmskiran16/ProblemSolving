package com.practice;

public class Codility_Test_1 {

    private static long mode = 1000000007;

    public static void main(String[] args) {
        System.out.println(findMinTotalTravel(new int[]{1, 5, 9, 12}));

//        System.out.println(new Codility_Test_1().power(3, 9, 11));
    }

    private static int findMinTotalTravel(int[] A) {

        Integer result = 0;
        for(int i=0; i<A.length - 1; i++) {
            Integer tempResult = 0;
            for(int j=0; j<A.length - 1; j++) {
                if((i == 0 && j != i) || j > i)
//                    tempResult += A[A.length -1] - A[j];
                    tempResult = Math.toIntExact((tempResult + (A[A.length -1] - A[j])) % mode);
                else if(j<i) {
//                    tempResult += A[i] - A[j];
                    tempResult = Math.toIntExact((tempResult + (A[i] - A[j])) % mode);
                }
            }
            result = (result > tempResult || result == 0)?Math.toIntExact(tempResult%mode):result;
        }

        return (int)result;
    }

    int power(int x, int y, int m)
    {
        if (y == 0)
            return 1;
        int p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (y % 2 == 0) ? p : (x * p) % m;
    }
}
