package com.multi;

import java.util.Scanner;



public class Thead_example3 {

	public static void main(String[] args) {


		Thread t1 = new Thread(() -> {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a = scan.nextInt();

			System.out.println("Enter the second number.");
			int b = scan.nextInt();

			System.out.println("addtion are " + (a + b));

			System.out.println("add part complited");

		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			System.out.println("NUmber part complited");
		});

		Thread t3 = new Thread(() -> {
			for (int i = 65; i <= 70; i++) {
				System.out.println((char) i);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			System.out.println("Character part complited");

		});

		t1.start();
		t2.start();
		t3.start();

	}

}
