package com.multi;

class EvenNumber extends Thread{
	
	@Override
	public  void run() {
		
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class OddNumber extends Thread{
	@Override
	public void run() {
		for(int i=1;i<20;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


public class ParallelNumberPrinter {

	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		OddNumber oddNumber = new OddNumber();
		evenNumber.start();
		oddNumber.start();
	}

}
