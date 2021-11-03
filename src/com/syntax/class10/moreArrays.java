package com.syntax.class10;

public class moreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A', 'D', 'A', 'C'};
		for(char grade:grades) {
			System.out.print(grade+ "  ");
		}
		
		System.out.println();
		//reverse
		for(int i=grades.length-1; i>0; i--) {
			System.out.print(grades[i]+ "  ");
		}
	}

}
