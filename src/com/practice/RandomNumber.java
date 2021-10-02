package com.practice;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Set;



public class RandomNumber {

	public static void main(String args[]) {
        RandomToken randomToken = new RandomToken(35);
        
        Set set = new HashSet<>();
        String temp;
        int j=0;
        
        for(int i=0; i<100000; i++) {
        	temp = randomToken.nextString();
        	if(!set.contains(temp)) {
        		set.add(temp);	
        		j++;
        	} else {
        		System.out.println("*******************************************"+temp);	
        	}
        	
        	
        }
        System.out.println(j);

	}
}

class RandomToken {

    public  RandomToken() {
        this(21);
    }

    public String nextString() {
        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = symbols[random.nextInt(symbols.length)];
        return new String(buf);
    }

    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);

    public static final String DIGITS = "0123456789";

    public static final String ALPHANUM = UPPER + LOWER + DIGITS;

    private final Random random;

    private final char[] symbols;

    private final char[] buf;

    public RandomToken (int length, Random random, String symbols) {
        if (length < 1) throw new IllegalArgumentException();
        if (symbols.length() < 2) throw new IllegalArgumentException();

        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }

    public RandomToken(int length, Random random) {
        this(length, random, ALPHANUM);
    }

    public RandomToken(int length) {
        this(length, new SecureRandom());
    }



}
