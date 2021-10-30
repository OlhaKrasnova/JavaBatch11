package com.syntax.class02;

public class Homework4 {

	public static void main(String[] args) {
		// 1. Declare variable and increase by 100 using shorthand operator
		// 2. Declare variable and decrease by 67 using shorthand operator
		// 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using
		// shorthand operator
		// each person should get an equal piece of cake
		// 4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		// Find out how many pieces of cake left after it was
		// distributed equally among 7 people

		int num1 = 500;
		num1 += 100;
		System.out.println(num1);

		int num2 = 250;
		num2 -= 67;
		System.out.println(num2);

		int cakePiece = 11;

		System.out.println(cakePiece / 4);
		System.out.println(cakePiece % 4);

		int cakePiece1 = 25;
		
		System.out.println(cakePiece1/7);
		System.out.println(cakePiece1 % 7);
	}

}
