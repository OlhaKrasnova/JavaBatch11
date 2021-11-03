package com.syntax.class10;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		// lets create a 2D array of shopping list
		
		String[][] groceries= {
				{"banana", "apple", "mango"},
				{"potato", "tomato"},
				{"milk", "cheese", "ayran", "yogurt"}
		};
		System.out.println(groceries.length);
		System.out.println(groceries[2][3]); //yogurt
		//i want to find how many elements my 1array has
		System.out.println("# of elements inside 1st array  =" +groceries[0].length);
		System.out.println("# of elements inside 2nd array  =" +groceries[1].length);
		System.out.println("# of elements inside 3rd array  =" +groceries[2].length);
		
		//how do we get all the elements from 2D array?
		int total=0;
		
		for(int i=0; i<groceries.length; i++) {
			for (int j=0; j<groceries[i].length; j++) {
				System.out.print(groceries[i][j]+ "  ");
				total++;
			}
			
			System.out.println();
		}
		
		
				System.out.println("# of elements inside 2d array is =" + total);
			
		}

	}


