package com.practice;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class EmmaSuperComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoPluses(new String[] {"rrgrr","rrgrr","ggggg","rrgrr","rrgrr"});
	}
	
	static int twoPluses(String[] grid) {
		
		int inputArray[][] = new int[grid.length][grid[0].length()];
		int traceArray[][] = new int[grid.length][grid[0].length()];		
		
		int i = 0;
		for(String str : grid) {
			inputArray[i] = str.chars().toArray();
			Arrays.setAll(traceArray[i++], new IntUnaryOperator() {
				
				@Override
				public int applyAsInt(int operand) {
					// TODO Auto-generated method stub
					return 0;
				}
			});
		}
		
		int result = isPlus(2, 2, inputArray, 1);
		System.out.println("result :: "+result);
		return 0;
	}
	
	
	static int isPlus(int r, int c, int[][] arr, int index) {
				
		for(int col, row = r-index; row <= row+index; row++) {
			for(col = c-index; col <= col+index; col++) {
				if((row != index || col != index) && arr[row][col] == 'g') {
					return index;
				}
			}
		}
		
		return isPlus(r, c, arr, index++);
	}
	

}
