package com.syntax.class04;

public class Assignment3 {

	public static void main(String[] args) {
		// In order to be eligible to donate your blood you have to be 18 years old.
		// Also once you identify age eligibility then we have to see if person matches
		// weight requirements. If person weight it more than 110 lbs → then he/she is
		// eligible, otherwise we cannot accept such a patient.
		
		int age = 25;
		int weight = 100;

		if (age >= 18) {
			System.out.println("You are age eligible");

			if (weight > 110) {
				System.out.println("We can accept the patient");
			} else {
				System.out.println("We cannot accept the patient");
			}
		} else {
			System.out.println("You are not eligible");
		}
	}

}
