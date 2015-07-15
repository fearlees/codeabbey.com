package com.raapp.codeabbeyTask.problem48;

/*
 * Task 48
 * 
 * Your task is for given numbers to calculate how many steps are necessary to come to 1.
 *
 * Input data contains number of test-cases in the first line.
 * Second line contains the test-cases - 
 * i.e. the values for which calculations should be performed.
 *
 * Answer should contain the same amount of results, 
 * each of them being the count of steps for getting Collatz Sequence to 1.
 */
import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			// get next value
			int value = scanner.nextInt();

			// print result
			System.out.print(collatz(value) + " ");
		}

		scanner.close();

	}

	// check count of step
	static int collatz(int val) {
		int count = 0;
		while (val != 1) {
			// increment count
			count++;

			// change our value
			if ((val % 2) == 0)
				val /= 2;
			else
				val = val * 3 + 1;

		}
		return count;

	}

}
