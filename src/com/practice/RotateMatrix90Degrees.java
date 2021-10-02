package com.practice;

/**
 
123			369
456  -->    258
789         147

**/

public class RotateMatrix90Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RotateMatrix90Degrees().rotate90Degrees();
	}
	
	public void rotate90Degrees() {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int rotatedArray[][] = new int[3][3];		
		
		
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr.length; j++) {
				rotatedArray[arr.length - j - 1][i] = arr[i][j];
			}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(" "+rotatedArray[i][j]);
			}
			System.out.println("");	
		}
	}
	
}
