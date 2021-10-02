package com.practice;

public class MakingAnagrams_E {
    public static void main(String[] args) {
        System.out.println(makingAnagrams("ashley", "ash"));
    }
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        int result = 0;

        int s1_cahrs[] = new int[26];
        int s2_cahrs[] = new int[26];

        s1.chars().forEach(i->{s1_cahrs[i-'a']++;});
        s2.chars().forEach(i->{s2_cahrs[i-'a']++;});

        int diff = 0;
        for(int i=0; i<s1_cahrs.length; i++) {
            diff = s1_cahrs[i] - s2_cahrs[i];
            result += (diff>0)?diff:-diff;
        }
        return result;
    }
}
