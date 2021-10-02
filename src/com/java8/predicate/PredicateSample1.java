package com.java8.predicate;

import java.util.Arrays;

public class PredicateSample1 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		String[] strArray = {"one", "two", "three", "four", "five"};
		
		Arrays.stream(strArray)
				.filter(s -> s.length()>3)
				.forEach(System.out::println);
		
	}
}
