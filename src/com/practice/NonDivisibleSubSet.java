package com.practice;

public class NonDivisibleSubSet {
    public static void main(String args[]) {


//        System.out.println(new NonDivisibleSubSet().getNonDivisibleSubSetCnt(7, new int[]{278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436}));
        System.out.println(new NonDivisibleSubSet().getNonDivisibleSubSetCnt(4, new int[]{19,10,12,10,24,25,22}));
    }

    private int getNonDivisibleSubSetCnt(int k, int[] s) {

        int divisibleCnt[] = new int[k];
        for(int i=0; i<s.length; i++) {
            divisibleCnt[s[i]%k]++;
        }

        int result = 0;
        int middle = ((k%2) == 0) ? (k/2) : (k/2)+1;

        for(int i=1; i<middle; i++) {
            result += (divisibleCnt[i] > divisibleCnt[k-i] ? divisibleCnt[i] : divisibleCnt[k-i]);
        }

        if(divisibleCnt[0] > 0) {
            result++;
        }

        if(k%2 == 0 && divisibleCnt[k%2] > 0) {
            result++;
        }

        return result;
    }
}
