package com.syntax.class07;

import java.util.Scanner;

public class DooLoopExample {

	public static void main(String[] args) {
		/*
		 * lets create a secret number (1 to 100)
		 * lets ask user to guess my secret number
		 */
int secretNumber=78;
Scanner scan=new Scanner(System.in);
int userNumber;

do {
	System.out.println("Please guess my secret number. it is a numberfrom 1 to 100");
	userNumber=scan.nextInt();
	
	
} while(userNumber!=secretNumber);
System.out.println("You got it!");
	}

}
