package com.raapp.codeabbeyTask.problem9;

import java.util.Scanner;

/*
 * Task 9 
 * 
 * Input data: First line will contain number of triplets.
 * Other lines will contain triplets themselves (each in separate line.
 *
 * Answer: You should output 1 or 0 for each triplet (1 if triangle could be built and 0 otherwise).
 */
public class Triangles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			// scan triplets triangle sizes
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (isTriangle(a, b, c))
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");

		}
		scanner.close();

	}

	// check for triangle
	private static boolean isTriangle(int a, int b, int c) {
		boolean tr;
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
			tr = true;
		else
			tr = false;
		return tr;
	}

}
