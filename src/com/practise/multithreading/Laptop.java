package com.practise.multithreading;

public class Laptop extends Thread{
	
	public void run() {
		System.out.println("Run method is overridden");
		playSong();
		System.out.println("=====Song Ends======");
	}
	
	public void playSong() {
		for(int i=1;i<=10;i++)
			System.out.println("Singing Line: "+i);
	}

}