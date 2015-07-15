package com.raapp.codeabbeyTask.problem4;

import java.util.Scanner;

/*
 * Task 4
 * Most programs should be able to make some choices and decisions. 
 * And we are going to practice conditional programming now.
 */
public class MinTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			// return input data
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			// check min value
			int min = Math.min(a, b);
			// print min value
			System.out.print(min + " ");
		}
		scanner.close();
	}

}
