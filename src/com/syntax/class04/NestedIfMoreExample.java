package com.syntax.class04;

public class NestedIfMoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean replCompleted=true;
		int assignments=5;
		
		if(replCompleted) {
			
			
			if(assignments>16) {
				System.out.println("You did an amazing job");
			}else if (assignments>10) {
				System.out.println("you did good but you should do more");
			}else if (assignments>6) {
				System.out.println("Please try to do more homework");
			}else {
				System.out.println("Why?");
			}
		}else {
			System.out.println("Please make sure you do your homework");
		}

	}

}
