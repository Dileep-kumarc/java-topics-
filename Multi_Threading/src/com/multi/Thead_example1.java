package com.multi;

import java.util.Scanner;

class Addtion extends Thread {
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
}

class Charprint extends Thread {
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

class Num extends Thread {
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

public class Thead_example1 {

	public static void main(String[] args) {
		Addtion add = new Addtion();
		Charprint ch = new Charprint();
		Num num = new Num();
		
//		add.run();
//		ch.run();
//		ch.run(); executes method squrntuially
		
		add.start();
		ch.start();
		num.start();
	}

}
