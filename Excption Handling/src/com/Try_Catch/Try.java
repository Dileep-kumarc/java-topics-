package com.Try_Catch;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the 1st number:");
			int a=sc.nextInt();
			
			System.out.print("Enter the 2nd number:");
			int b=sc.nextInt();
			
			System.out.println("result is "+ (a/b));
			
		}
		catch(Exception d) {
			System.out.println("enter the valid number 2nd greater than 0");
		}

	}

}
