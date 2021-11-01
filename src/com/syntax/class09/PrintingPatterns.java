package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {

		for(int i =1; i<=4; i++) {
			for(int j=1; j<=5;j++) {
			System.out.print(" * ");
			
		}
		System.out.println();
}
		
		for(int r =1; r<=4; r++) {
			for(int c=1; c<=5;c++) {
				
			
			System.out.print(c);
			
		}
			
		System.out.println();
	}

		for(int r =5; r>=1; r--) {
			for(int c=1; c<=4;c++) {
				
			
			System.out.print(r);
			
		}
			
		System.out.println();
	}
}
}