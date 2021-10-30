package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// works for boolean

		int number1=10;
		int number2=20;
		System.out.println("I am before if condition");
		if(number1>number2) {
			System.out.println("I am inside if condition");
			System.out.println("I am inside if condition");
			System.out.println("I am inside if condition");
			System.out.println("I am inside if condition");
			//it will only print out if its TRUE
		}else {
			System.out.println("i will go for a walk");
		}
		
		System.out.println("After if condition");
		
		
		
		System.out.println("******************");
		
		String userName="Hormat";
		
		
		if(userName.equals("Hormat")) {
			System.out.println("Hi Hormat");
		}else {
			System.out.println("I dont know you");
			
		}
	}

	
	
}
