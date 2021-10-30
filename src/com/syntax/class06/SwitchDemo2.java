package com.syntax.class06;

public class SwitchDemo2 {
	public static void main(String[] args) {
		
		//rules:
		//1.values in case MUST be same data type as a VARIABLE in switch
		//2. cannot have duplicate cases
		char gender='m';
		String description;
		
		switch(gender) {
		
		case 'm':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
			default:
				description="Unknown";
		}
System.out.println(gender+ "means" + description);
}
	
	/*
	 * limitation
	 * 1. cannot use logical operators
	 * 2.cannot use relational operators
	 * 
	 * limitation of data types
	 * -cannot use boolean
	 * -cannot be used with double/float
	 * -cannot be used with long
	 * 
	 */
}
