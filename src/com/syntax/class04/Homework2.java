package com.syntax.class04;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner loan=new Scanner(System.in);
		
		System.out.println("Please enter the amount of loan you need");
		int num1=loan.nextInt();
		
		if (num1<=200000) {
			System.out.println("You are approved for loan");
		}else {
			System.out.println("Loan rejected");
		}
		
	}

}
