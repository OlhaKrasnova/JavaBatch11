package com.syntax.class06;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, 
		//C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade 
		//was entered by a user with explanation.
		System.out.println("Enter your grade!");
		Scanner scan=new Scanner(System.in);
		char grade=scan.next().charAt(0);
		String expl;
		
		switch(grade) {
		
		case 'A':
			expl="excellent";
			break;
		case 'B':
			expl="good";
			break;
		case 'C':
			expl="average";
			break;
		case 'D':
			expl="bad";
			
			default:
			expl="not acceptable";
			
		}
			
		if(!expl.equals("not acceptable")) {
	System.out.println("If your grade is "+grade+" then your knowlege is "+expl);
		}else {
		System.out.println("Please enter another grade");
	}
		
		}
		
		
	

}


