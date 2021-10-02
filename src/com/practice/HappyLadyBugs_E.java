package com.practice;

import java.util.HashMap;

public class HappyLadyBugs_E {
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static String RESULT = YES;

    public static void main(String[] args) {
        System.out.println(happyLadybugs("B_"));
    }

    public static String happyLadybugs(String b) {
        // Write your code here
        if(isLadybugHappy(b))
            return RESULT;

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        RESULT = YES;

        b.chars().forEach(i -> {
            resultMap.put(i, (resultMap.containsKey(i)?(resultMap.get(i)+1):1));
        });

        resultMap.keySet().stream().forEach(i -> {
            if((resultMap.get(i) == 1 && i!= '_') || (!resultMap.containsKey((int)'_'))) {
                RESULT = NO;
            }
        });

        return RESULT;
    }

    private static boolean isLadybugHappy(String str) {

        str = str.replace("_","");
        if(str.length() == 0) {
            return true;
        } else if(str.length() == 1) {
            return false;
        }else if(str.length() == 2) {
            if(str.charAt(0) == str.charAt(1))
                return true;
            else
                return false;
        }

        for(int i=1; i<str.length()-1; i++) {
            if(str.charAt(i-1)!=str.charAt(i) && str.charAt(i)!=str.charAt(i+1)) {
                return false;
            }
        }

        return true;
    }

}
