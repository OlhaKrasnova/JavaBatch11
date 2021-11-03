package com.syntax.class10;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// ask user to make an array and store elements using scanner
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside array of cars");
		
		int size=scan.nextInt();
		
		String[] cars=new String[size];
		
		//storing elements inside an array
		for(int i=0; i<size; i++) {
			System.out.println("Pleas enter your cars");
			cars[i]=scan.next();
			
		}
		//retreive all stored elements
		
		for(String car:cars) {
			System.out.print(car+"  ");
		}

	}

}
