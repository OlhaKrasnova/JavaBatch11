package com.syntax.class02;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1=10;
		int number2=20;
		System.out.println(number1+number2);
		System.out.println(number1-number2);
		System.out.println(number1*number2);
		System.out.println(number1/number2);
		
		double number3=10;
		double number4=20;
		
		System.out.println(number3+number4);
		System.out.println(number3-number4);
		System.out.println(number3*number4);
		System.out.println(number3/number4);
		
		// if you know the asnwer will contain decimal points, always use data type"double"
		
		boolean var1=true;
		boolean var2=false;
		
		// System.out.println(var1+var2); cannot calculate non numeric variables
		
		char char1='A';
		char char2='B';
		System.out.println(char1+char2);
		System.out.println(char1-char2);
		System.out.println(char1*char2);
		System.out.println(char1/char2);
		
		String str1="hi";
		String str2="bye";
		System.out.println(str1+str2);
		//System.out.println(str1-str2); NOT ALLOWED
		//System.out.println(str1*str2); NOT ALLOWED
		//System.out.println(str1/str2); NOT ALLOWED
		
	}

}
