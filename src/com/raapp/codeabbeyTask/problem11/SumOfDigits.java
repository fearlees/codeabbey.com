package com.raapp.codeabbeyTask.problem11;

/*
 * Task 11
 * 
 * Input data are in the following format:

 * first line contains N - the number of values to process;
 * and then N lines will follow describing the values for which sum of digits should be calculated by 3 integers A B C;
 * for each case you need to multiply A by B and add C (i.e. A * B + C) - then calculate sum of digits of the result.
 *
 * Answer should have N results, also separated by spaces. For example:
 */
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();
		System.out.println("\n answer:");
		for (int i = 0; i < num; i++) {
			// Get tree input value to calculate them
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int sum = digitSum(a, b, c);

			// print result
			System.out.print(sum + " ");
		}
		scanner.close();
	}

	private static int digitSum(int a, int b, int c) {
		int sum = 0;
		int value = ((a * b) + c);
		// sum digit of current value
		while (value > 0) {
			sum += value % 10;
			value = value / 10;
		}
		return sum;
	}
}
