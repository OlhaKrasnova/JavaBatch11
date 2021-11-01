package com.syntax.class09;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an array of chars and store grades into it:A,B,C,D,E,F
		
		//1st way of creating an array
		char[] grades=new char [6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';

		System.out.println(grades[1]);
		
		int num;
		num=10;
		
		char[] gender; //declare an array
		gender=new char[2]; //initialize size
		
		//2nd way to create an array
		
		char[] gradesArray= {'A', 'B', 'C', 'D'};
		System.out.println(gradesArray.length); //4
		System.out.println("Element with index 2 is" +gradesArray[2]);
		
		String[] names= {"Oleksandr", "Mehmet", "Emilija", "Naiya"};
		names[0]="Priyasri"; //to replace element with index 0
		
		String[] cars=new String[3];
		
		
	}

}
