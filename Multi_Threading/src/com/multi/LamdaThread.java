package com.multi;

public class LamdaThread {
	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Runnable thread 1 "+i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(()->{
			for(int i=65;i<70;i++) {
				System.out.println("Runnable thread 2 "+ (char)i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();
	
	}
}
