package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 * capture a country from a user
		 * based on the country define their favorite food
		 */
		String country;
		String food=null;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Where are you from?");
	    
	    country = scan.next();
	    
	    switch (country) {
	        case "USA":
	            food="burgers";
	            
	          break;
	        case "Ukraine":
	            food="borsh";
	            break;
	        case "Italy":
	            food="pizza";
	        case "India":
	        	food="curry";
	            break;
	        default:
	            food="invalid answer";
	            break;
	}
	    if (!food.equals("invalid answer")) {
	    	System.out.println("If you re from " + country+ " then you probably like to eat " + food);

	    }else {
	    System.out.println("Please try another country");

}
}
}
