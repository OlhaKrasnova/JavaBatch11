package com.syntax.class05;

import java.util.Scanner;

public class symplifyingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter three numbers");
		
		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
				
		int num3=scan.nextInt();
		double largest=0;
		
		
		if (num1>=num2 && num1>num3){
			largest=num1;
			
		}else if (num2>=num1 && num2>num3) {
			
			largest=num2;
			
         }else if (num3>=num1 && num3>num2) {
			
			largest=num3;
       							}
		
		boolean isEven;
		
		if(largest%2==0) {
			isEven=true;
		}else {
			isEven=false;
		

	}
		System.out.println(largest + "number is even" +isEven);

}

}


