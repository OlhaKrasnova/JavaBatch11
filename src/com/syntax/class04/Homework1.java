package com.syntax.class04;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Create a Java program to capture 2 numbers from a user and define which number is the largest.
		
		Scanner numbers=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=numbers.nextInt();
		System.out.println("Please enter second number");
		
		int num2=numbers.nextInt();
		
		if (num1>num2) {
			System.out.println("First number is largest");
		}else {
			System.out.println("Second number is largest");
			
		}
		

	}

}
