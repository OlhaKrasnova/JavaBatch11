package com.syntax.class06;

import java.util.Scanner;

public class practiceString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings");
    String word1=scan.next();
    String word2=scan.next();
    System.out.println("Please enter two numbers");
    int int1=scan.nextInt();
    int int2=scan.nextInt();
    if ((int1==int2) && word1.equals(word2)){
      System.out.println("AND");
    } else if ((int1!=int2) && word1.equals(word2)){
      System.out.println ("OR");
    } else if ((int1!=int2) && (!word1.equals(word2))){
      System.out.println("NONE");
    }
    String drink;
    
    }




	}
