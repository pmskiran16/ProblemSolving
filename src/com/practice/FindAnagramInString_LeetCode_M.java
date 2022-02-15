package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagramInString_LeetCode_M {
    public static void main(String[] args) {
        new FindAnagramInString_LeetCode_M().findAnagrams("cbaebabacd", "abc").forEach(System.out::println);
//        new FindAnagramInString_LeetCode_M().findAnagrams("af", "be").forEach(System.out::println);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> pMap = new HashMap<>();
        HashMap<Integer, Integer> windowMap = new HashMap<>();

        for(int i=0; i<26; i++) {
            pMap.put(i, 0);
            windowMap.put(i, 0);
        }

        p.chars().forEach(c -> {
                pMap.put(c-'a', (pMap.get(c-'a') + 1));
        });

        for(int j=0, k=0; k<s.length(); k++) {
            windowMap.put(s.charAt(k) - 'a', windowMap.get(s.charAt(k)-'a') +1);

            if(k-j == p.length()-1) {
                if(pMap.equals(windowMap))
                    result.add(j);
                windowMap.put(s.charAt(j)-'a', windowMap.get(s.charAt(j)-'a') -1);
                j++;
            }
        }

        return result;
    }
}
