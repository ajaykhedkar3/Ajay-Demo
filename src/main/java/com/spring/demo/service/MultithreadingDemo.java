package com.spring.demo.service;

public class MultithreadingDemo implements Runnable {
	
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" "+"is running");
	}
	
	
	public static void main(String[] args) {
		int thread =5;
		for(int i=0; i<=5; i++) {
			
			
			Thread obj = new Thread(new MultithreadingDemo());
			obj.start();
		}
		
	}

}
