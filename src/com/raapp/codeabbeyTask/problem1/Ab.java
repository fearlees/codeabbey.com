package com.raapp.codeabbeyTask.problem1;

import java.util.Scanner;

/*
 * Task 1
 * 
 * Input data: 3325987 7563154
 */
public class Ab {

	public static void main(String[] args) {
		// read input data
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		// calculate sum
		int c = a + b;

		System.out.println(c);

	}

}