package com.syntax.class10;

public class AllElementsFromTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] groceries = { { "banana", "apple", "mango" }, // 0

				{ "potato", "tomato" }, // 1

				{ "milk", "cheese", "ayran", "yogurt" }// 2
		};
		for (String[] grocery : groceries) {

			for (String g : grocery) {
				System.out.print(g + " ");

			}
			System.out.println();

		}

	}
}
