package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner whatever=new Scanner(System.in);
		
		System.out.println("Please enter an item you want to buy");
		
		String item=whatever.next();// one word only
		
		System.out.println("Please enter the price of the " + item);
		
		double price=whatever.nextDouble();//one double value
		
		System.out.println("You selected " + item + " with price =" + price);
		
		
		
		
		
		

	}

}
