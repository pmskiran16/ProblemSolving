package com.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempClass tempObj = new TempClass();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("Getter :: "+tempObj.counter.get());	
				}				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("Setter :: "+tempObj.setI());	
				}				
			}
		}).start();		
		
	}
	
}

class TempClass {
	public volatile AtomicInteger counter = new AtomicInteger();
	
	public int getI() {				
			return counter.get();
	}
	
	public int setI() {
			return counter.incrementAndGet();
	}
}
