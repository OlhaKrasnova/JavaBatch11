package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/* 
		 * Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		System.out.println("Enter operator");
		char operator=scan.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("The result is " + (num1+num2));
			break;
		case '-':
			System.out.println("The result is " + (num1-num2));
			break;
		case '/':
			if (num1!=0) {
			System.out.println("The result is " + (num1/num2));
			}
			break;
		case '*':
			System.out.println("The result is " + (num1*num2));
			break;
			default:
				System.out.println("Wrong entry");
		}
		
		
		
	}

}
