package com.practice;

public class KaprekarNumber {

	public static void main(String[] args) {

		KaprekarNumber.isKarprekarNumber(1, 99999);
	}

	private static void isKarprekarNumber(int p, int q) {
		boolean result = false;
		StringBuilder builder = new StringBuilder();
		
		if(p<q)
		for(int i=p; i<=q; i++) {
			System.out.println("i :: "+i);
			String square = new String(""+(long)Math.pow(i, 2));
			result = (i == (Integer.parseInt(square.substring(square.length() - (""+i).length(), square.length()))
						+ Integer.parseInt(
								(square.substring(0, square.length() - (""+i).length())).length() ==0 ? "0" : (square.substring(0, square.length() - (""+i).length())))))?true:false;
			if(result) {
				builder.append(i+" ");
			}
		}
		
		if(builder.toString().length() == 0) {
			System.out.println("INVALID RANGE");
		} else {
			System.out.println(builder.toString());	
		}
		
		
	}
	
}
