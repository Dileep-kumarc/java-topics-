package com.Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExcption {

	public static void main(String[] args) {
			try {
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter the size of the array");
				int n=scan.nextInt();
				
				int[] arr=new int [n];
				
				System.out.println("Enter the data");
				int data=scan.nextInt();
				
				System.out.println("Enter the index you want insert data");
				int index=scan.nextInt();
				
				arr[index]=data;
				
				System.out.println(arr[index]);
			}
			
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Enter array out of limit enter valid input.");
			}
			catch(InputMismatchException b) {
				System.out.println("Enter the expected input.");
			}
			catch(NegativeArraySizeException c) {
				System.out.println("Negative array can't create.");
			}
			catch(Exception e) {
				System.out.println("Enter the correct input..");
			}
			
			

	}

}
