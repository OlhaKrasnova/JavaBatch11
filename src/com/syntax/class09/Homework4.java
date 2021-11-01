package com.syntax.class09;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		
		int[] num = {45, 13, 1, 99, 15, 77, 61, 5};
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i] + ", ");
			sum += num[i];
		}
		System.out.println("The sum of all array's elements is = " + sum);
	}

	}

