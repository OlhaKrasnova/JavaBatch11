package com.syntax.class10;

public class AllElementsFromTwoDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { { 100, 200, 300 }, { 9, 8, 7 }, };

		System.out.println("Size of array = " + numbers.length);
		System.out.println(numbers[1][1]);

//get all elements
		for (int[] nums : numbers) {
			for (int n : nums) {
				System.out.print(n + "  ");
			}
			System.out.println();

		}
		System.out.println(" get all elements using regular for loop");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int element = numbers[i][j];
				System.out.print(element + "  ");

			}
			System.out.println();
		}
	}

}