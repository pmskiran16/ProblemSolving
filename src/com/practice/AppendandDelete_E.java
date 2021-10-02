package com.practice;

public class AppendandDelete_E {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int result = 0;
        int s_chars[] = new int[26];
        int t_chars[] = new int[26];

        s.chars().forEach(i->{s_chars[i-'a']++;});
        t.chars().forEach(i->{t_chars[i-'a']++;});

        int minStringLen = (s.length()<t.length())?s.length():t.length();
        for(int i=0; i<minStringLen; i++) {
            if(s.charAt(i) == t.charAt(i)) {
                s_chars[s.charAt(i)-'a']--;
                t_chars[t.charAt(i)-'a']--;
            } else {
                break;
            }
        }

        int diff = 0;
        for(int i=0; i<s_chars.length; i++) {
            diff = s_chars[i] + t_chars[i];
            result += (diff>0)?diff:-diff;
        }

        if(result <= k)
            return "Yes";
        return "No";
    }
}
