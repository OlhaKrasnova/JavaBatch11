package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1 = " hello world ";
		int number1 = 10;
		String result = var1 + number1;
		System.out.println(result);
		boolean isTrue = true;
		System.out.println(isTrue + result);

		System.out.println("******************");

		int number2 = 14;
		int number3 = 3;
		System.out.println(number2 / number3);
		System.out.println(number2 % number3);

		System.out.println("******************");

		double number4 = 14;
		double number5 = 3;
		System.out.println(number4 / number5);
		System.out.println(number4 % number5);

		System.out.println("******************");

		int number6 = -100;
		number6++;
		System.out.println(number6);
		number6--;
		System.out.println(number6);

		double number7 = 10;
		System.out.println(number7++);
		System.out.println("******************");
		double number8 = 20;
		number8 += 10;
		System.out.println(number8);
		number8 -= 40;
		System.out.println(number8);
		

	}

}
