package com.syntax.class10;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array in which first array will consist of 4 names and second
		 * array will contain grades. Then your program should print name of the
		 * students that has A and B grade
		 */
	String names[][]= {{"Brown", "Malone", "Jackson", "Truman"},
	{"A", "B", "C", "D", "E"}
	};
	
	System.out.println("Student " + names[0][0]+ " has grade " + names [1][0]);
	System.out.println("Student " + names[0][2]+ " has grade " + names [1][1]);
	
	
	}

}
