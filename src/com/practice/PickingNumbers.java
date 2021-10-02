package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,1,2,2,4,4,5,5,5};
		List<Integer> list = IntStream.of(intArray).boxed().collect(Collectors.toList());
		
		System.out.println("Result :: "+pickingNumbers(list));
	}
	
	public static int pickingNumbers(List<Integer> a) {		
		int result = 0;
		int tempArray[] = new int[100];
		Arrays.fill(tempArray, 0);
		for(int i=0; i<a.size(); i++) {
			tempArray[a.get(i)] = tempArray[a.get(i)] + 1;
		}
		
		int size = tempArray.length;
		
		if(size > 1)
		for(int i=1; i<size; i++) {
			if((tempArray[i-1] + tempArray[i]) > result) {
				result = (tempArray[i-1] + tempArray[i]);
			}
		}		
		
		return result;
	}

}
