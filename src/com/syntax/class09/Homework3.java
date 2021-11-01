package com.syntax.class09;

public class Homework3 {

	public static void main(String[] args) {
		
			/*
			 * Create an array to store double values and then print those in reverse order
			 */
			
			double[] num = new double[6];
			
			num[0] = 1.5;
			num[1] = 0.75;
			num[2] = 23.12;
			num[3] = 61.3;
			num[4] = 30.01;
			num[5] = 45.22;
			
			for(int i=num.length-1; i>=0; i--) {
				System.out.println(num[i] + " ");
			}
			

		}


	}


