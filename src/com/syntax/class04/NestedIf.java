package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine=true;
		
		int dose=1;
				
				if(vaccine) {
					
					System.out.println("How many doses have you taken?");
					
					if(dose==1) {
						System.out.println("When are you taking your 2nd dose?");
					}else {
							System.out.println("You are fully vaccinated");
						}
					}
				
				
				
				System.out.println("---------------------");
				
				String day="Friday";
				int date=13;
				int time=12;
				
				
				if(day.equals("Friday")) {
					System.out.println("I'm going to the movies");
					
					if (date==13) {
						System.out.println("I am watching a scary movie");
					}else {
						System.out.println("I am watching a comedy today");
					}
					
					
				}else {
					System.out.println("I am going to study");
					
					if (time>23) {
						System.out.println("I have to go sleep because i have a class");
					}
					
					
					
				}
					
				}

	}


