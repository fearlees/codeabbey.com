package com.raapp.codeabbeyTask.problem13;

import java.util.Scanner;

/*
 * Task 13 (char version)
 * 
 * Input data will give the number of test-cases in the first line.
 * Values themselves are in the second line. For each of these values you are to calculate weighted sum of digits.
 *
 * Answer: as usually, put results in one line, separating them with spaces.
 * 
 */
public class WeightedSumOfDigits_char {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int sum = 0;

			// get value to check
			String value = scanner.next();
			// loop for check every char one by one
			for (int j = 0; j < value.length(); j++) {
				int digit = Character.getNumericValue(value.charAt(j));
				sum += digit * (j + 1);
			}
			System.out.print(sum + " ");
		}
		scanner.close();

	}

}
