package com.practice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalculation {

    public static void main(String args[]) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update("Kiran1*".getBytes());
            String encryptedString = new String(messageDigest.digest());

            System.out.println("Encrypted String :: "+encryptedString);
            for(int i=0; i< encryptedString.length(); i++) {
                System.out.print(" "+(int)encryptedString.charAt(i));
            }
        } catch (NoSuchAlgorithmException e) {

        }
    }
}
