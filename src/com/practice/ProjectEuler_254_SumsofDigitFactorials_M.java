package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectEuler_254_SumsofDigitFactorials_M {

    private static HashMap<Integer, Integer> factorialMap = new HashMap<>();
    private static HashMap<Integer, Integer> factorialValues = new HashMap<>();

    private static int length = 6;
    private static int factorials[] = new int[]{0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    private static int queryValue = 41;
    private static boolean resultFound = false;

    public static void main(String[] args) {

//        try {
//            readInput();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("GetDigits factorial :"+getDigitsFactorial(20));

        /*while (result == 0 && !resultFound) {
            findCombination("");
            length++;
        }

        System.out.println("Result :2: "+result);*/

        /*try {
            readInput_1();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//        findCombination(new StringBuilder("000"), 0);

//        System.out.println(factorialSumValue_1(new BigInteger("123")));
//        System.out.println(factorialSumValue_1(new BigInteger("23599")));
        findCombination(new StringBuilder("000000"), 0);
    }

    private static void readInput_1() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        Integer noOfTestCases = Integer.parseInt(reader.readLine());
        String[] testCases = new String[noOfTestCases];
        for(int i = 0; i < noOfTestCases; i++) {
            testCases[i] = reader.readLine();
        }
        reader.close();

        for(int j = 0; j < noOfTestCases; j++) {
            String[] values = testCases[j].split(" ");
            Integer n = Integer.valueOf(values[0]);
            Integer m = Integer.valueOf(values[1]);

            long timeStart = System.currentTimeMillis();
            System.out.println(getResult_1(n, m));
            System.out.println("Total time in milli seconds: "+(System.currentTimeMillis() - timeStart));
        }
    }

    private static void readInput() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        Integer noOfTestCases = Integer.parseInt(reader.readLine());
        String[] testCases = new String[noOfTestCases];
        for(int i = 0; i < noOfTestCases; i++) {
            testCases[i] = reader.readLine();
        }
        reader.close();

        for(int j = 0; j < noOfTestCases; j++) {
            String[] values = testCases[j].split(" ");
            Integer n = Integer.valueOf(values[0]);
            Integer m = Integer.valueOf(values[1]);

            long timeStart = System.currentTimeMillis();
            System.out.println(getResult(n, m));
            System.out.println("Total time in Seconds: "+(System.currentTimeMillis() - timeStart)/1000);
        }
    }

    private static Integer getResult_1(Integer n, Integer modulo) {
        Integer tempResult = 0;
//        Integer combinationValue = 0;
        String tempString = "";
        for(int i = 1; i <= n; i++) {
            queryValue = i;
            while (!resultFound) {
                StringBuilder stringBuilder = new StringBuilder();
                for(int j=0; j<length; j++) {
                    stringBuilder.append('0');
                }

                tempString = findCombination(stringBuilder, 0);
                length++;
            }

            int comValue = getDigitsSum_1(tempString);
            System.out.println("Num: "+i+" -- Value: "+comValue);
            tempResult += comValue;
            resultFound = false;
            length = 1;
        }

        return tempResult % modulo;
    }

    private static Integer getResult(Integer n, Integer modulo) {
        Integer result = 0;
        for(int i = 1; i <= n; i++) {
            Integer j = 1;
            Integer tempResult = 0;

            while(tempResult != i) {
                if(factorialMap.containsKey(j)) {
                    tempResult = factorialMap.get(j);
                } else {
                    Integer factorial = getDigitsFactorial(j);
                    tempResult = getDigitsSum(factorial);
                    factorialMap.put(j, tempResult);
                }
                j +=1;
            }

            System.out.println("tempResult:"+tempResult+" -- j:"+(j-1));
            result += getDigitsSum(--j);
        }

        return (result<modulo)?result:(result%modulo);
    }

    private static Integer getDigitsFactorial(Integer i) {
        Integer result = 0;
        int temp = 0;
        while(i > 0) {
            temp = i%10;
            if(factorialValues.containsKey(temp)) {
                result += factorialValues.get(temp);
            } else {
                int factorial = getFactorial(temp);
                result += factorial;
                factorialValues.put(temp, factorial);
            }
            i /= 10;
        }
        return result;
    }

    private static Integer getFactorial(Integer i) {
        if( i == 0)
            return 1;
        return i * (factorialValues.containsKey(i-1)?factorialValues.get(i-1):getFactorial(i-1));
    }

    private static Integer getDigitsSum(Integer i) {
        int result = 0;
        while (i > 0 ) {
            result += i%10;
            i /= 10;
        }
        return result;
    }

    private static String findCombination(StringBuilder num, int numIndex) {
        if(numIndex == length) {
//            if(Integer.parseInt(num.toString()) == 725888)
//                System.out.println(""+num.toString());
            if(getDigitsSum_1(num.toString()) == 38) {
                System.out.println("Total value of "+num.toString()+" is 38");
            }
            return num.toString();
        }

        for(int i=0; i<10; i++) {
            num.setCharAt(numIndex, (char)(i+'0'));
            String tempResult = findCombination(num, numIndex<length?(numIndex+1):numIndex);
//            if(tempResult.indexOf("0") == -1 && !tempResult.isEmpty()) {
//
//                Integer digitsSum = getDigitsSum_1(factorialSumValue_1(new BigInteger(""+tempResult)));
//                if(digitsSum == queryValue) {
//                    resultFound = true;
//                    return tempResult;
//                }
//            }
        }

        return "";
    }

    private static Integer factorialSumValue(Integer number) {
        Integer result = 0;
        while(number > 0) {
            result += factorials[number%10];
            number /= 10;
        }
        return result;
    }

    private static String factorialSumValue_1(BigInteger number) {
        BigInteger result = BigInteger.ZERO;

        while (number.compareTo(BigInteger.ZERO) > 0) {
            result = result.add(new BigInteger(""+factorials[number.mod(BigInteger.TEN).intValue()]));
            number = number.divide(BigInteger.TEN);
        }

        return result.toString();
    }

    private static Integer getDigitsSum_1(String sumString) {
        Integer result = 0;
        for(int i=0; i<sumString.length(); i++) {
            result += Integer.parseInt(""+sumString.charAt(i));
        }

        return result;
    }
}
