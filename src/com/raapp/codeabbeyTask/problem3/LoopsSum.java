package com.raapp.codeabbeyTask.problem3;

import java.util.Scanner;

/*
 * Task 3
 * 
 * Now you will be given several pairs of values 
 * and you need to calculate sum for each pair.
 *
 * Input data will contain the total count of pairs to process in the first line.
 * The following lines will contain pairs themselves - one pair at each line.
 * Answer should contain the results separated by spaces.
 */
public class LoopsSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//check number of pair
		int n = scanner.nextInt();

		//calculate sum of all pair
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = a + b;
			System.out.print(sum + " ");
		}
		
		scanner.close();
	}
}
