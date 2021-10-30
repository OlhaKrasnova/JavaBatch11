package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * nested loop - loop inside another loop
		 */
		for (int i = 1; i <= 9; i++) { // outer loop
			for (int j = 0; j <= 9; j++) { // inner loop

				System.out.println(i + " " + j);
			}
		}

		System.out.println("End of code");
		System.out.println("Car odometer");

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int x = 0; x <= 9; x++) {
					for (int y = 0; y <= 9; y++) {
						System.out.println(i  + " " + j + " "+ x + " "+  y);
					}
				}
			}
		}
		
		System.out.println("Multiplication table");
		for (int i=1; i<=9; i++) {
			for (int j =1; j<=9; j++) {
				System.out.println(i + "*" +j + "=" + i*j);
			}
		}
	}

}

