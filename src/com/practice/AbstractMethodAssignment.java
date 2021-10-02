package com.practice;

public class AbstractMethodAssignment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstartImpl tempObj = new MyAbstartImpl(10);		
		System.out.println("MyString :: "+tempObj.getTempString());			
	}		
}

class MyAbstartImpl extends MyAbstractClass {
	
	public MyAbstartImpl() {}
	
	public MyAbstartImpl(int j) {
		for(int i=0; i<1000000; i++) {
			System.out.println("No : "+i);
		}
	}
	
	@Override
	public String myString() {
		// TODO Auto-generated method stub
		return "MyAbstartImpl";
	}
	
}

abstract class MyAbstractClass {	
	public String tempString = myString();
			
	public String getTempString() {
		return tempString;
	}
	public abstract String myString();		
}
