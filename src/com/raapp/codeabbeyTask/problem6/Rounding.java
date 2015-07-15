package com.raapp.codeabbeyTask.problem6;

import java.util.Scanner;

/*
 * Task 6
 * 
 * There are several pairs of numbers. 
 * For each pair you are to divide first by second and 
 * return the result, rounded to nearest integer.
 */
public class Rounding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of value
		int n = scanner.nextInt();

		System.out.println("answer:");

		for (int i = 0; i < n; i++) {
			int result;
			// scan next value
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			// calculate float value
			float divValue = (float) a / b;
			// rounding float to closest int
			result = Math.round(divValue);
			System.out.print(result + " ");
		}
		scanner.close();
	}
}
