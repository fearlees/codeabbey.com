package com.raapp.codeabbeyTask.problem8;

import java.util.Scanner;

/*
 * Task 8
 * 
 * Input data: first line contains the number of test-cases.
 * Other lines contain test-cases in form of triplets of values 
 * A B N where A is the first value of the sequence, 
 * B is the step size and N is the number of first values which should be accounted.
 * 
 * Answer: you are to output results (sums of N first members) 
 * for each sequence, separated by spaces.
 */
public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("answer:");
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int progression;
			int bNumber = bNumber(c);
			progression = (a * c) + (b * bNumber);
			System.out.print(progression + " ");
		}
		scanner.close();
	}

	private static int bNumber(int num) {
		int bNumber = 0;
		for (int i = 0; i < num; i++)
			bNumber += i;
		return bNumber;
	}

}
