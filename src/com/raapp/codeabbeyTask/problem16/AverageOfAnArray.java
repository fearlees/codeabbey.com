package com.raapp.codeabbeyTask.problem16;

/*
 * Task 16
 * 
 * Input data will give the number of test-cases in the first line.
 * Then test-cases themselves will follow, one case per line.
 * Each test-case describes an array of positive integers with value of 0 marking end. 
 * (this zero should not be included into calculations!!!).
 * 
 * Answer should contain average values for each array, 
 * rounded to nearest integer (see task on rounding), 
 * separated by spaces.
 */
import java.util.Scanner;

public class AverageOfAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of test-cases
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			// result, sum, temp value, count
			int average, sum = 0, j, numberOfValue = 0;

			// loop for calculate sum and take count of values in line
			while ((j = scanner.nextInt()) != 0) {
				numberOfValue++;
				sum += j;
			}

			// calculate result average
			average = Math.round((float) sum / numberOfValue);

			// print result
			System.out.print(average + " ");
		}
		scanner.close();
	}
}
