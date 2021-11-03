package com.syntax.class10;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list. Inside you should have an array of
		 * veggies, fruits, dairy and sweets. Retrieve all values from that array using
		 * 2 different loops
		 */
	String groceries[][]= {{"Tomatoes", "Potatoes", "Carrots", "Corn"},
			{"Apples", "Watermelon", "Cherry"},
			{"Milk", "Yogurt", "Sour cream", "Buttermilk"},
			{"Candy", "Cake", "Marshmallows"}};
	
	for (String []grocery:groceries) {
		for(String g:grocery) {
			System.out.println(g + " ");

		}
	
		
		for (int i=0; i<groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++){
				String item = groceries[i][j];
				System.out.println(item + " ");
			}
		}
	}
	
	}

}
