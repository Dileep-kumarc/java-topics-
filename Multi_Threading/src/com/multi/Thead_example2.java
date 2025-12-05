package com.multi;

import java.util.Scanner;

class Add implements Runnable {
	// add
	@Override
	public void run() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();

		System.out.println("Enter the second number.");
		int b = scan.nextInt();

		System.out.println("addtion are " + (a + b));
		
		System.out.println("add part complited");

	}
	
//	()->{
//		
//	};
}

class Chprint implements Runnable {
	@Override
	public void run() {
		// num

		for (int i = 1; i <= 5; i++) {
			System.out.println( i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("NUmber part complited");
	}
}

class Num1 implements Runnable {
	@Override
	public void run() {
		// char
		for (int i = 65; i <= 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Character part complited");
	}
}

public class Thead_example2 {

	public static void main(String[] args) {
		Add add = new Add();
		Chprint ch = new Chprint();
		Num1 num = new Num1();
		
		
		Thread t2=new Thread(ch);
		Thread t3=new Thread(num);
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		
		t2.start();
		t3.start();
		
		
	}

}
