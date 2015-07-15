package com.raapp.codeabbeyTask.problem68;

import java.util.Scanner;

/*
 * Task 68
 * 
 * Input data will have the number of test-cases in the first line.
 * Next lines will contain three values each S A B.
 *
 * Answer should contain the distances between first city and rendezvous point 
 * (i.e. distance travelled by first cyclist before they meet), 
 * separated with spaces.
 */
public class BicycleRace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			double valS = scanner.nextDouble();
			double valA = scanner.nextDouble();
			double valB = scanner.nextDouble();

			double distance = valS * (valA / (valA + valB));

			System.out.print(distance + " ");
		}
		scanner.close();

	}

}
