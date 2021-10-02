package com.practice;

import java.util.Arrays;
import java.util.List;

public class PrideMonthCharityStream_C {
    public static void main(String[] args) {
        System.out.println(simpleGame(Arrays.asList(2, 1,4, 3)));
    }

    public static int simpleGame(List<Integer> scores) {
        // Write your code here

        int cnt = scores.size(),a=0 , b=0;
        boolean flip = false, gamer = true;
        int temp;
        for(int i = 0, j=0, k=cnt-1; i < cnt; i++) {

            if(gamer) {
                temp = scores.get(flip?k--:j++);
                a += temp;
                gamer = !gamer;
            } else {
                temp = scores.get(flip?k--:j++);
                b += temp;
                gamer = !gamer;
            }

            if(temp % 2 == 0) {
                flip = !flip;
            }
        }

        return a-b;
    }
}
