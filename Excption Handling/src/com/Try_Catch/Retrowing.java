package com.Try_Catch;

import java.util.Scanner;

class Multiple {
	void multi()throws Exception  {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the first number:");
			int n=scan.nextInt();
			
			System.out.println("Enter the second number:");
			int m=scan.nextInt();
			
			int res=n/m;

			
			System.out.println(res);
		}
		catch(Exception e){
			System.out.println("Enter a valid input multi1.");
			throw e;
		} 
		finally{
			System.out.println("It must excute.");
			
		}
	}
}
public class Retrowing {

	public static void main(String[] args) {
	
		try {
				Multiple multi = new Multiple();
				multi.multi();
		}
		catch(Exception e) {
			System.out.println("invalid input main method ");
		}
		
	}

}
