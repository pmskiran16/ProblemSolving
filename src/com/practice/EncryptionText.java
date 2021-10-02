package com.practice;
/*
 * Max score - 30
 * */
public class EncryptionText {

    public static void main(String args[]) {

        String str = "haveaniceday";
        
        System.out.println(new EncryptionText().encryptedString(str));
    }


    private String encryptedString(String s) {
        String str = s.replaceAll(" ", "");

        int strLength = str.length();
        int rows = (int) Math.floor(Math.sqrt(str.length()));
        int column =  (rows*rows == strLength)?rows:rows+1;
        rows = (rows*column < strLength)?rows+1:rows;
                
        StringBuilder stringBuilder = new StringBuilder();
        for(int col = 0, row = 0; col < column; col++) {
            for(row = 0; row < rows; row++) {
                if(((row * column)+col) <= strLength-1) {
                    stringBuilder.append(str.charAt((row * column)+col));
                }
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
