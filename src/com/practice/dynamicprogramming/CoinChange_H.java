package com.practice.dynamicprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CoinChange_H {

    private static List<String> resultList = new ArrayList<>();
    private static Set<String> actualResultSet = new HashSet<>();
    private static HashMap<Integer, String> intermediateResults = new HashMap<>();
    private static int targetAmount;
    private static int count = 0;
    private static int[] myCoins;

    public static void main(String[] args) {
        int n = 12;
//        System.out.println(ways(n, Arrays.asList(36, 10, 42, 7, 50, 1, 49, 24, 37, 12, 34, 13, 39, 18, 8, 29, 19, 43, 5, 44, 28, 23, 35, 26)));
//        System.out.println(ways(n, Arrays.asList(1, 2, 5, 10)));
//        System.out.println(ways(n, Arrays.asList(2, 3, 5, 6)));
//        int[] myCoins = new int[]{2, 3, 5, 6};
        int[] myCoins = new int[]{1, 2, 5, 10};
//        findDirectChange_1(targetAmount, 3, myCoins, new StringBuilder(), 0);
        System.out.println(change(n, myCoins));

    }


    //Others optimized version.
    public static long change(int dollars, int[] coins) {
        //"Degenerate" cases
        if (dollars == 0) { return 1; }
        if (coins.length == 0) { return 0; }

        long[] store = new long[dollars+1];
        store[0] = 1;       //There's always 1 way to make $0

        for (int coin : coins) {
            for (int i = 0; i < store.length-coin; i++) {
                store[i+coin] += store[i];
            }
        }
        return store[dollars];
    }
    //======================

    // My version, it works but don't meet time complexity.
    public static int ways(int n, List<Integer> coins) {
        targetAmount = n;
        myCoins = new int[coins.size()];
        Collections.sort(coins);
        for(int i=0; i<coins.size(); i++)
            myCoins[i] = coins.get(i);

        findDirectChange_1(targetAmount, myCoins.length-1, new StringBuilder(), 0);
        return count;
    }

    private static void findDirectChange_1(int n, int i, StringBuilder strb, int sum) {
        if(sum > targetAmount) {
            return;
        }

        while(i>=0 && sum < targetAmount) {
            //To reduce iteration when change finding come down to smallest coin available.
            if(i == 0 && n%myCoins[i] == 0) {
                int minCoingCnt = (n / myCoins[i]) - 1;
                sum += minCoingCnt*myCoins[i];
                while (minCoingCnt-- > 0)
                    strb.append(myCoins[i]);
            }

            if(sum+myCoins[i] <= targetAmount)
                findDirectChange_1(n-myCoins[i], (n-myCoins[i]/myCoins[i])>=1?i:i-1, new StringBuilder(strb).append(myCoins[i]), sum+myCoins[i]);

            --i;
        }

        if(sum == targetAmount) {
            count++;
            System.out.println(strb.toString());
        }
    }

    //============

    private static void possibleChange(List<Integer> change) {
        int i = 0;
        boolean status = false;
        Collections.sort(change);

        for(; i<change.size(); i++) {
            if(intermediateResults.containsKey(change.get(i))) {
                String tempString = intermediateResults.get(change.get(i));
                List<Integer> newChangeList = new ArrayList<>(change);

                newChangeList.remove(i);
                newChangeList.addAll(Arrays.stream(tempString.split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
                possibleChange(newChangeList);
            }
        }

        actualResultSet.add(change.toString());
    }

    public static int ways_1(int n, List<Integer> coins) {
        // Write your code here
        int[] myCoins = new int[coins.size()];
        Collections.sort(coins);
        for(int i=0; i<coins.size(); i++)
            myCoins[i] = coins.get(i);

        for(int i = 0; i < coins.size() && n >= myCoins[i]; i++) {
            String tempResult = findDirectChanges(n, i, myCoins);
            if(tempResult != null) {
                resultList.add(tempResult);
            }
        }

        for(int i = 1; i < myCoins.length; i++) {
            String tempResult = findDirectChanges(myCoins[i], i-1, myCoins);
            if(tempResult != null)
                intermediateResults.put(myCoins[i], tempResult);
        }

        resultList.forEach(str -> possibleChange(Arrays.stream(str.split(" ")).map(Integer::parseInt).collect(Collectors.toList())));
        actualResultSet.stream().forEach(System.out::println);
        return actualResultSet.size();
    }

    private static String findDirectChanges(int n, int i, int[] coins) {
        StringBuilder tempStrBuilder = new StringBuilder();

        while (n >= coins[i] && i >= 0) {
            n -= coins[i];
            tempStrBuilder.append(coins[i]+" ");
            while(n < coins[i] && i > 0) {
                i--;
            }
        }


        if(n == 0)
            return tempStrBuilder.toString();
        else
            return null;
    }
}
