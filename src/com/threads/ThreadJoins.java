package com.threads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadJoins {
    public static void main(String args[]) throws InterruptedException {

        List<Long> longList = Arrays.asList(100000l, 20l, 30l, 200l);

        List<Factorial> threadList = new ArrayList<>();
        for (Long l:longList) {
            threadList.add(new Factorial(l));
        }

        for (Factorial t:threadList) {
            t.start();
        }

        for (Factorial t:threadList) {
            t.join(1000l);
        }

        for (Factorial t:threadList) {
            if(t.isFinished)
                System.out.println("Factorial of "+t.getNumber()+" is "+t.getResult());
            else
                System.out.println("Factorial of "+t.getNumber()+" is not finished.");
        }

    }

    private static class Factorial extends Thread {
        private long number;
        private boolean isFinished = false;
        private BigInteger result = BigInteger.ONE;

        public Factorial(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }

        public boolean isFinished() {
            return isFinished;
        }

        public BigInteger getResult() {
            return result;
        }

        @Override
        public void run() {
            result = factorial(this.number);
            this.isFinished = true;
            System.out.println("Calculation finished for "+this.number);
        }

        private BigInteger factorial(long number) {
            BigInteger tempResult = BigInteger.ONE;

            for(long i = number; i>0; i--) {
                tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
            }

            return tempResult;
        }

    }
    
}
