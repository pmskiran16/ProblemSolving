package com.practice;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar_LeetCode_M {
    public static void main(String[] args) {
        System.out.println(new LongestSubStringWithoutRepeatingChar_LeetCode_M().lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<String, Integer> charMap = new HashMap<>();
        int longestSubStringIndex=-1;
        int longestSubStringLength = 0;
        int tempLongestSubStringIndex=-1;
        int tempLongestSubStringLength=0;

        int strLength = s.length();

        for(int i=0;i<strLength; i++) {
            char tempChar = s.charAt(i);
            if(!charMap.containsKey(tempChar+"")) {
                if(tempLongestSubStringIndex == -1) {
                    tempLongestSubStringIndex = i;
                }
                tempLongestSubStringLength++;
                charMap.put(tempChar+"", 1);
            } else {
                if(longestSubStringLength < tempLongestSubStringLength) {
                    longestSubStringLength = tempLongestSubStringLength;
                    longestSubStringIndex = tempLongestSubStringIndex;
                }

                int repeatedIndex = s.substring(tempLongestSubStringIndex, i).indexOf(tempChar);
                for(int j=0; j<=repeatedIndex; j++) {
                    charMap.remove(s.charAt(tempLongestSubStringIndex+j)+"");
                    tempLongestSubStringLength--;
                }

                tempLongestSubStringLength += 1;
                tempLongestSubStringIndex += repeatedIndex+1;
                charMap.put(tempChar+"", 1);
            }
        }

        if(longestSubStringLength < tempLongestSubStringLength)
            longestSubStringLength = tempLongestSubStringLength;

        return longestSubStringLength;
    }
}
