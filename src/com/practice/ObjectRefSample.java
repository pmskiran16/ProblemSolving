package com.practice;

public class ObjectRefSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj = new Sample("First");
		
		System.out.println("1 :: "+obj.getStr());
		new ObjectRefSample().test(obj);
		System.out.println("2 :: "+obj.getStr());

	}
	
	
	public void test(Sample s) {
//		s = new Sample("Second");
		s.setStr("Second");
	}
	
}

class Sample {
	public String str;
	
	Sample(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
