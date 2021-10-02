package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlmostSorted_M {

	private static final String REVERSE = "reverse";
	private static final String SWAP = "swap";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		almostSorted(Arrays.asList(10, 11, 16, 13, 14, 15, 12, 17, 18));
//		almostSorted(Arrays.asList(3, 2, 1));
//		almostSorted(Arrays.asList(10, 11, 16, 15, 14, 13, 12, 17));
		almostSorted(Arrays.asList(21, 19));
	}

	public static void almostSorted(List<Integer> arr) {
		// Write your code here
		if(isListSorted(arr)) {
			System.out.println("List already Sorted.");
		}

		int l = -1, r = -1;
		boolean swap = false, reverse = false, sequenceFlag = false;
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i-1) > arr.get(i) && l == -1) {
				swap = true;
				sequenceFlag = true;
				l = i-1;
				r = i;
			} else if(arr.get(i-1) > arr.get(i)) {
				if(sequenceFlag) {
					reverse = true;
					swap = false;
				} else {
					swap = true;
					r = i;
					break;
				}

				r = i;
			} else if(arr.get(i-1) < arr.get(i)){
				sequenceFlag = false;
				if(reverse){
					break;
				}
			}
		}

		 if(swap || (r-l) <= 2 ) {
			int tmp = arr.get(r);
			arr.set(r, arr.get(l));
			arr.set(l, tmp);

			printOutPut(arr, SWAP, l, r);
		} else if(reverse) {
			List<Integer> reverseList = arr.subList(l, r+1);
			Collections.reverse(reverseList);

			for(int i = l; i <= r; i++) {
				arr.set(i, reverseList.get(i-l));
			}

			printOutPut(arr, REVERSE, l, r);
		} else {
			 System.out.println("no");
		 }
	}

	private static boolean isListSorted(List<Integer> list) {
		return list.equals(Arrays.asList(list.stream().sorted().toArray()));
	}

	private static void printOutPut(List<Integer> arr, String result, int l, int r) {
		if(isListSorted(arr)) {
			System.out.println("yes");
			System.out.println(result+" "+(l+1)+" "+(r+1));
		} else {
			System.out.println("no");
		}
	}

}
