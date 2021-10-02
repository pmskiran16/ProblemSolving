package com.practice;

public class FindDigits {
    public static void main(String args[]) {

        System.out.println("DigitCount :: "+findDigits(111));
    }

    private static int findDigits(int n) {
        int result = 0;

        int i = 10;
        int temp = n;
        while(temp/i > 0) {
            int digit = temp%i;
            if(digit != 0)
                result = (n%digit == 0)?++result:result;
            temp/=i;
        }

        result = (n%temp == 0)?++result:result;

        return result;
    }

}
