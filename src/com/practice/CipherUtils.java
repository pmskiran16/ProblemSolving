//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.practice;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class CipherUtils {
    private static byte[] key = new byte[]{116, 104, 105, 115, 73, 115, 65, 83, 101, 99, 114, 101, 116, 75, 101, 121};

    public CipherUtils() {
    }

    public static String encrypt(String strToEncrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(1, secretKey);
            String encryptedString = new String(cipher.doFinal(strToEncrypt.getBytes()));
            return encryptedString;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String strToDecrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(2, secretKey);
            String decryptedString = new String(cipher.doFinal(strToDecrypt.getBytes()));
            return decryptedString;
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
/*
        String strToEncrypt = "I am a good boy";
        String encryptedStr = encrypt(strToEncrypt.trim());
        System.out.println("String to Encrypt : " + strToEncrypt);
        System.out.println("Encrypted : " + encryptedStr);
        String decryptedStr = decrypt(encryptedStr);
        System.out.println("String To Decrypt : " + encryptedStr);
        System.out.println("Decrypted : " + decryptedStr);
*/

        int j = 0;
        for(int i=0; i<1000000; i++) {

            String passPhrase = generatePassPhrase();
            if(passPhrase.length() == 16) {
                System.out.println("Value : "+i+"::"+passPhrase);
                j++;
            }
        }

        System.out.println("Values count : "+j);

//        final long min = 1000000;
//        final long max = 99999999;
//
//        SecureRandom random = new SecureRandom();
//        long x1 = (random.nextLong() % (max - min)) + min;
//        long x2 = (random.nextLong() % (max - min)) + min;
//        final String key1 = String.valueOf(x1<0 ? -x1 : x1);
//        final String key2 = String.valueOf(x2<0 ? -x2 : x2);
//        System.out.println("Ramdom is :: "+key1+key2);


    }


    public static String generatePassPhrase() {
        final long min = 10000000;
        final long max = 99999999;

        SecureRandom random = new SecureRandom();

        long key1 = (Math.abs(random.nextLong()) % (max - min)) + min;
        long key2 = (Math.abs(random.nextLong()) % (max - min)) + min;

        return String.valueOf(key1) + String.valueOf(key2);
    }
}
