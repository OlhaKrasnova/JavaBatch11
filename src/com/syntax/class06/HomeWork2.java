package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		
		System.out.println("Enter second number");
		double num2=scan.nextDouble();
		
		System.out.println("Enter operator");
		String operator=scan.next();
		
		if(operator.equals("+")) {
			System.out.println("The result is " + (num1+num2));
		} else if(operator.equals("-")) {
			System.out.println("The result is " + (num1-num2));
		} else if (operator.equals("/")) {
			System.out.println("The result is " + (num1/num2));
		} else if(operator.equals("*")) {
			System.out.println("The result is " + (num1*num2));
			
			
			
		}
		
	}

}
