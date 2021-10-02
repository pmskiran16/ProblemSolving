package com.practice;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class AbsolutePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(absolutePermutation(2, 1)).forEach(i->System.out.print(i+" "));
	}

	static int[] absolutePermutation(int n, int k) {
		int availStatus[] = new int[n];
		Arrays.fill(availStatus, 0);

		IntegerArray resultArray = new IntegerArray();
		for(int i=0; i<n; i++) {
			if(i-k >= 0 && availStatus[i-k] == 0) {
				resultArray.add(i-k+1);
				availStatus[i-k] = 1;
			}else if(i+k < n && availStatus[i+k] == 0) {
				resultArray.add(i+k+1);
				availStatus[i+k] = 1;
			} else {
				int[] temp= {-1};
				return temp;
			}
		}		
				
//		Arrays.stream(resultArray.toIntArray()).forEach(i->System.out.println(i));
		
		return resultArray.toIntArray();
	} 
}
