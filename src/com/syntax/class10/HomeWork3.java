package com.syntax.class10;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
	String cars[][]={{"american", "german", "korean", "italian"},
		{"Ford", "Mercedes", "Kia", "Maserati"},
		
	};
	for (String[] car : cars) {

		for (String c : car) {
			System.out.print(c + " ");

		}
		System.out.println();

	}
	for (int i = 0; i < cars.length; i++) {
		for (int j = 0; j < cars[i].length; j++) {
			String car = cars[i][j];
			System.out.print(car + "  ");

		}
		System.out.println();
	
	}
	}

}
