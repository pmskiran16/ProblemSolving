package com.practice;

public class EncodeDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decode(Encode(10, 20));
	}
	
	private static long Encode(int m, int n) {
		return (m * (long)Math.pow(2, 17)) + n;
	}
	
	private static void Decode(long x) {
		int m = (int) (x / (long)Math.pow(2, 17));
		int n = (int) (x % (long)Math.pow(2, 17));
		
		System.out.println("m::"+m+" -- n::"+n);
	}

}
