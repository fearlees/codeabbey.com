package com.raapp.codeabbeyTask.problem13;

import java.util.Scanner;

/*
 * Task 13 (hash version)
 * 
 * Input data will give the number of test-cases in the first line.
 * Values themselves are in the second line. For each of these values you are to calculate weighted sum of digits.
 *
 * Answer: as usually, put results in one line, separating them with spaces.
 * 
 */
public class WeightedSumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			int sum = 0;
			// get value to check
			int value = scanner.nextInt();

			while (value > 0) {
				sum += value % 10 * i;
				value = value / 10;
			}
			System.out.print(sum + " ");
		}
		scanner.close();

	}
}
