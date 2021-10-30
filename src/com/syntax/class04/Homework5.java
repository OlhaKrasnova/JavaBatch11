package com.syntax.class04;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. If you
		// user does not have a credit card then offer them. If they do have one ask
		// what is balance on the card? If balance of the card is larger than 1000, tell
		// them to pay off immediately, otherwise you can tell them that they can spend
		// more.

		Scanner credit=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean answer=credit.nextBoolean();
		
		if (answer==true) {
			System.out.println("what is the balance?");
			double balance=credit.nextDouble();
			if (balance>1000) {
				System.out.println("Pay off the balance immediately");
			} else {
				System.out.println("You can spend more");
			
			}
			
			
		
		} else {
			System.out.println("Would you like to get one?");
		}
		
	}

}
