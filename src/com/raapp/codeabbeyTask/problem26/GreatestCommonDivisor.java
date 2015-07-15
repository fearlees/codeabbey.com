package com.raapp.codeabbeyTask.problem26;

import java.util.Scanner;

/*
 * Task 26
 * 
 * Input data contain number of test-cases in the first line.
 * Then lines with test-cases follow, each containing two numbers - for A and B.
 *
 * Answer should contain GCD and LCM for each pair, 
 * surrounded by brackets and separated by spaces.
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int gcd = calculateGcd(value1, value2);
			int lcm = calculateLcm(value1, value2, gcd);
			
			System.out.print("(" + gcd + " " + lcm + ") ");
		}
		scanner.close();
	}

	/**
	 * Calculate Greatest Common Divisor or GCD
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int calculateGcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b; // base case
		return calculateGcd(b, a % b);
	}

	/**
	 * Calculate Least Common Multiple or LCM.
	 * 
	 * @param a
	 * @param b
	 * @param gcd
	 * @return
	 */
	private static int calculateLcm(int a, int b, int gcd) {
		int lcm = a * b / gcd;
		return lcm;
	}

	/**
	 * Calculate Least Common Multiple or LCM.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	/*private static int calculateLcm(int a, int b) {
		int lcm = a * b / calculateGcd(a, b);
		return lcm;
	}*/

}
