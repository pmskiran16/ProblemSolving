package com.java8.predicate;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations_java8 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		printCount(arr);
		printSum(arr);
		printArray(arr);
	}
	
	static void printCount(int[] arr) {		
		System.out.printf("Count : %d%n", IntStream.of(arr).count());
	} 
	
	static void printSum(int[] arr) {
		System.out.printf("Sum : %d%n", IntStream.of(arr).reduce((a, b) -> a+b).getAsInt());
	}

	static void printArray(int[] arr) {
		System.out.println(IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));	
	}
	
}
