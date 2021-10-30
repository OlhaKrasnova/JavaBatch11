package com.syntax.class07;

public class Assignment {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways) Print odd numbers between 20 and 50
		 * (2 ways)
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("******************");

		for (int b = 100; b >= 1; b--) {
			System.out.println(b);
		}
		System.out.println("******************");

		for (int x = 20; x >= 1; x--) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}

		System.out.println("******************");

		for (int y = 20; y >= 2; y -= 2) {
			System.out.println(y);
		}

		System.out.println("******************");

		for (int f = 20; f <= 50; f++) {
			if (f % 2 == 1) {
				System.out.println(f);
			}
		}

		System.out.println("******************");

		for (int d = 21; d <= 50; d += 2) {
			System.out.println(d);
		}
	}
}
