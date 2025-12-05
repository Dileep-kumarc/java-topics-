package com.multi;

import java.util.Scanner;

class SingelRun extends Thread {
	@Override
	public void run() {
		String name = getName();
		if (name.equals("add")) {
			add();
		} else if (name.equals("printArray")) {
			printArray();
		} else {
			printNumber();
		}

	}

	void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scanner.nextInt();
		System.out.println("Enter the second number");
		int b = scanner.nextInt();
		System.out.println("Sum is " + (a + b));

	}

	void printArray() {
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	void printNumber() {
		for (int i = 70; i < 75; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class Single_run {
	public static void main(String[] args) {
		SingelRun s1 = new SingelRun();
		SingelRun s2 = new SingelRun();
		SingelRun s3 = new SingelRun();

		s1.setName("add");
		s2.setName("printArray");
		s3.setName("printNumber");

		s1.start();
		s2.start();
		s3.start();

	}
}
