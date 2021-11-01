package com.syntax.class08;

import java.util.Scanner;

public class Homework2 {
	/*
	 * Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please input the starting number: ");
		int start=input.nextInt();
		System.out.print("Please input the ending number: ");
		int end=input.nextInt();
		int even=0;
		int odd=0;
		for(int num1=start; num1<=end; num1++) {
			if(num1%2==0) {
				even+=num1;
			}else {
				odd+=num1;
			}
		}
		System.out.println("The sum off all the odd numbers is: "+odd);
		System.out.println("The sum of all the even numbers is: "+even);
	}

}
