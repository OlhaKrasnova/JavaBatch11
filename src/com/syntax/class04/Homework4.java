package com.syntax.class04;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature. Your
		// program should convert Fahrenheit into celsius and print “The temperature is
		// the city __ is __”

		Scanner program=new Scanner(System.in);
System.out.println("Please enter your city");
		
		String city=program.next();
		System.out.println("Enter temperature in F");
		int tempF=program.nextInt();
		
		int tempC = ((tempF-32)*5)/9;
		System.out.println("The temperature in " + city + " is " + tempC + "°C");
	}

}
