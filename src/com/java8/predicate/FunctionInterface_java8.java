package com.java8.predicate;

import java.util.function.Function;

public class FunctionInterface_java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInterface_java8 obj = new FunctionInterface_java8();
//		Function<String, Integer> toGetCharCnt = (String x) ->  obj.getCharCnt(x);
		Function<String, Integer> toGetCharCnt = obj::getCharCnt;
		Function<FunctionInterface_java8, String> returnString = FunctionInterface_java8::returnString;

	}

	public Integer getCharCnt(String str) {
		return new Integer(str.length());
	}
	
	public String returnString() {
		return "Empty";
	}
	
	
}
