package com.syntax.reviewclass3;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=20;
if(number>0) {
	if(number<100) {
		System.out.println("Number is from 1 to 99");
		
	} else {
		System.out.println("number is out of range");
	}
}

	
	if(number>0 && number<100) {
		System.out.println("Number is from 1 to 99");
	}else {
		System.out.println("number is out of range");
	}

	}

}
