package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<=5; i++) {
	System.out.println("Hello");
}
System.out.println("---- print numbers from 1 to 20 -----");


/* 1. start point
 * 2. end point
 * 3. increment/decrement
 */
	for(int i=100; i>=20; i--) {
		System.out.print(i+ " ");
	}
	
	System.out.println("---- print ONLY EVEN numbers from 1 to 50 -----");
	System.out.println("---- print ONLY EVEN numbers from 1 to 50 -----");
	
	for (int i=2; i<=50; i+=2) {
		if(i%2==0) {
		System.out.print(i+ " ");
	}
	}

	}
}
