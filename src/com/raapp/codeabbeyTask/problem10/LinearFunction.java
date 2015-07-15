package com.raapp.codeabbeyTask.problem10;

/*
 * Task 10
 * 
 * Input data have the number of test-cases in the first line
 * and then test-cases themselves in separate lines.
 * Each case contains 4 integers (x1 y1 x2 y2).
 *
 * Answers should be integer too and you are to write them in line, 
 * separating with spaces and enclosing each pair in parenthesis.
 */
import java.util.Scanner;

public class LinearFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			// get input value
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
 
			// calculate 'a'
			int a = getA(x1, y1, x2, y2);
			// calculate 'b'
			int b = getB(x1, y1, a);

			printAnswer(a, b);

		}
		scanner.close();

	}

	/**
	 * Determine 'a'
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	private static int getA(int x1, int y1, int x2, int y2) {
		int valA;
		valA = (y2 - y1) / (x2 - x1);
		return valA;
	}

	/**
	 * Determine 'b'
	 * 
	 * @param x1
	 * @param y1
	 * @param a
	 * @return
	 */
	private static int getB(int x1, int y1, int a) {
		int valB;
		valB = y1 - a * x1;
		return valB;
	}

	/**
	 * Print single answer in console
	 * 
	 * @param a
	 * @param b
	 */
	private static void printAnswer(int a, int b) {
		System.out.print("(" + a + " " + b + ") ");
	}
}
