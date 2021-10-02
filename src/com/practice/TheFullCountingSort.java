package com.practice;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class TheFullCountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TheFullCountingSort().insertionSort(new int[] {2,5,3,8,4});
	}
	
	
	private int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			for(; j>=0; j--) {
				if( j > 0 && arr[j] > key) {
					arr[j+1] = arr[j];					
				}				
			}
			arr[j+1] = key;
		}
		
		System.out.println("Final array :: "+Arrays.toString(arr));
		return arr;		
	}

}
