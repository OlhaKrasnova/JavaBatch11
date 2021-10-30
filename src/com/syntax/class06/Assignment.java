package com.syntax.class06;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		System.out.println("Enter your home country!");
		Scanner scan=new Scanner(System.in);
		String country=scan.next();
		String language;
		
		switch(country) {
		
		case "Ukraine":
			language="Ukrainian";
			break;
		case "Australia":
			language="English";
			break;
		case "Montenegro":
			language="Serbian";
			break;
		case "Korea":
			language="Korean";
			break;
			
			default:
			language="Unknown language";
			
		}
		if (!language.equals("Unknown language")) {
							
	System.out.println("Your home country is "+country+" and your language is "+language);
		}else {
			System.out.println("Please enter a different country");
		}
		
		}
		
		
	}

	

