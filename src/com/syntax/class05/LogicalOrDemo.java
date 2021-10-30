package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/* 
		 *  ask user to enter todays day
		 *  if monday or friday -----> no class
		 *  if tuesday or wednesday -----> manual testing class
		 *  if saturday or sunday -----> Java class
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")) {
			System.out.println("You have no class today");
			
		} else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")) {
			System.out.println("You have manual testing class today");
			
		} else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("You have Java class today");
			
		 } else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("You have review class today");
			
			
		}else {
			
			System.out.println("Wrong input");
		}
	}

}
