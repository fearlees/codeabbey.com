package com.raapp.codeabbeyTask.problem57;

import java.util.Locale;
import java.util.Scanner;

/*
 * Task 57
 * 
 * Input data will contain the length of the sequence in the first line.
 * The second line will contain the measurements itself.
 *
 * Answer should contain the processed sequence. 
 * All values should be calculated to precision of 1e-7 or better.
 */

public class SmoothingTheWeather {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
		int num = scanner.nextInt();
		double[] value = new double[num];

		for (int i = 0; i < num; i++) {
			// scan next value
			value[i] = scanner.nextDouble();

			// print first and middle value
			if (i == 0)
				printAnswer(value[i]);
			else if (i > 1)
				printAnswer(middle(value[i - 2], value[i - 1], value[i]));

			// print last value
			if (i == (num - 1))
				printAnswer(value[num - 1]);
		}
		scanner.close();
	}

	/**
	 * Calculate middle value
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static double middle(double a, double b, double c) {
		b = (a + b + c) / 3;
		return b;
	}

	/**
	 * Printing in terminal double value
	 * 
	 * @param val
	 */
	private static void printAnswer(double val) {
		System.out.print(val + " ");
	}

}
