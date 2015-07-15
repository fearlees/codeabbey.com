package com.raapp.codeabbeyTask.problem41;

import java.util.Scanner;

/*
 * Task 41
 * 
 * You will be again given triplets of numbers, 
 * but now the middle of them should be chosen - 
 * i.e. not the largest and not the smallest one. 
 * Such number is called the Median (of the set, array etc).
 * 
 * Input data will contain in the first line the number of triplets to follow.
 * Next lines will contain one triplet each.
 * Answer should contain selected medians of triplets, separated by spaces.
 */

//main class
public class MedianOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("answer:");

		for (int i = 0; i < n; i++) {
			// scan value to check
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			Median med = new Median(a, b, c);
			// return median value
			int median = med.median();

			System.out.print(median + " ");
		}
		scanner.close();
	}

}

// work class
class Median {
	int a, b, c;

	/**
	 * Constructor
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	Median(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Check median value
	 * 
	 * @return
	 */
	int median() {
		if (((a > b) && (a < c)) || ((a > c) && (a < b)))
			return a;
		else if (((b > a) && (b < c)) || ((b > c) && (b < a)))
			return b;
		else
			return c;
	}

}
