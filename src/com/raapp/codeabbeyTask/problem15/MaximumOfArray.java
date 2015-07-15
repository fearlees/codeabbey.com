package com.raapp.codeabbeyTask.problem15;
import java.util.Scanner;

/*
 * Task 15
 * 
 * Input data will give you exactly 300 numbers in a single line.
 * Answer should contain maximum and minimum of these values, separated by space.
 */
public class MaximumOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 0, max = 0;
		// Loop for check all value one-by-one
		for (int i = 0; i < 300; i++) {
			int val = scanner.nextInt();
			//look for minimum value
			if (min > val)
				min = val;
			//look for maximum value
			if (max < val)
				max = val;
		}
		scanner.close();

		System.out.print("answer:\n" + max + " " + min);
	}
}
