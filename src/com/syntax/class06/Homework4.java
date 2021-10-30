package com.syntax.class06;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space
Print numbers from 100 to 1
Print even numbers from 20 to 100 
Print only odd numbers from 100 to 1 TODO Auto-generated method stub
		 */
		int num1=1;
		int num2=100;
		int num3=20;
		int num4=99;
		while(num1<101) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
		while(num2>0) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println();
		while(num3<101) {
			System.out.print(num3+" ");
			num3+=2;
		}
		System.out.println();
		while(num4>0) {
			System.out.print(num4+" ");
			num4-=2;
		}

	}

}
