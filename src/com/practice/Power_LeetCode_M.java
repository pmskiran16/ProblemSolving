package com.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Power_LeetCode_M {
    public static void main(String[] args) {
        System.out.println(new Power_LeetCode_M().myPow(2.10000, 3));
    }

    public double myPow(double x, int n) {
        double result = power(x, (n>0)?n:-n);
        DecimalFormat df = new DecimalFormat("0.00000");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return Double.parseDouble(df.format((n>0) ? result : (1/result)));
//        return new BigDecimal((n>0) ? result : (1/result)).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }

    public double power(double x, int n) {
        if (n==0)
            return 1.00000;

        double d  = power(x, n/2);
        d = (n%2 == 0) ? (d*d) : (x*d*d);
        return d;
    }
}
