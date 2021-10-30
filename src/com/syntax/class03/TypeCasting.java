package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number=10;
		int number2;
		number2=(int)number; //assigning
		System.out.println(number2);
		
		int number3=10;
		double number4=number3;
		int number5=1256;
		byte number6=(byte)number5;
		System.out.println(number6);
		
		
		short number7=12;
		byte number8=(byte)number7;
		
		int number9=10000;
		float f=number9;
		long l=(long)f;
		
		
		double number10=10.5;
		int number11=(int)number10; //decimal points will get lost because int can only hold whole numbers and is a smaller box
		System.out.println(number11);
		
		
		
		
	}

}
