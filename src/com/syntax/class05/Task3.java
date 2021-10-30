package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Ask user to enter 3 numbers and define which is the largest number.
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter three numbers");
		
		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
				
		int num3=scan.nextInt();
		
		if (num1==num2 && num1==num3) {
			System.out.println("The numbers are equal");
		}else {
			
		}
		if (num1>=num2 && num1>num3){
			System.out.println(num1+ " is largest");
			
		}else if (num2>=num1 && num2>num3) {
			
			System.out.println(num2 + " is largest");
			
         }else if (num3>=num1 && num3>num2) {
			
			System.out.println(num3+ " is largest");
       			
			
		}
		
		
		

	}

}
