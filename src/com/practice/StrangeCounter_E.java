package com.practice;

public class StrangeCounter_E {
    public static void main(String[] args) {
        System.out.println(strangeCounter(15));
    }

    public static long strangeCounter(long t) {
        // Write your code here

        double timeCnt = 0, i=0, sum = 0;

         do{
            timeCnt =  3 * Math.pow(2, i);
            sum += timeCnt;
            i += 1;
        }while(t>sum);

         sum -=timeCnt;
         i-=1;
        return (long) (3*Math.pow(2,i) - (t - 1 - sum));
    }
}
