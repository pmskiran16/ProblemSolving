package com.practice;

public class InheritanceSample1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.fun1();
	}

}


class A {
	A() {
		System.out.println("A");
	}
	
	public void fun1() {
		System.out.println("A::fun1");
	}	
}

class B extends A{
	B() {
		System.out.println("B");
	}
	
	@Override
	public void fun1() {
		System.out.println("B::fun1");
	}	

}
