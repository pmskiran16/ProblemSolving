package com.practice;

public class TestSample {

    public static void main (String args[]) {
//        String str[] = {"cdabab","dcba","abcd"};
//        String str1[] = {"abcdba","abcd","abcdcd"};

//        String str[] = {"ab"};
//        String str1[] = {"ba"};
//        System.out.println("Result :: "+new TestSample().validate(str, str1));
    	
    	String str = null;
    	if(str.length() == 0) {
    		System.out.println("Test if block");
    	} else {
    		System.out.println("Test else block");
    	}
    	

    }

    public String[] validate(String []str1, String []str2) {

        if(str1.length != str2.length)
            return null;

        String resultStr[] = new String[str1.length];

        for(int i=0; i<str1.length; i++) {
            if(str1[i].length() != str2[i].length()) {
                resultStr[i] = "No";
            }else if((evenSum(str1[i]) == evenSum(str2[i])) && (oddSum(str1[i]) == oddSum(str2[i]))) {
                resultStr[i] = "Yes";
            } else {
                resultStr[i] = "No";
            }
        }

        return resultStr;
    }

    private int evenSum(String str) {
        int i = 0;
        int result = 0;
        while(i < str.length()) {
            result+=(int)str.charAt(i);
            i+=2;
        }
        return result;
    }

    private int oddSum(String str) {
        int i = 1;
        int result = 0;
        while(i < str.length()) {
            result+=(int)str.charAt(i);
            i+=2;
        }

        return result;
    }

}
