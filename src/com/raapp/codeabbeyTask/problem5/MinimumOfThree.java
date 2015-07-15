package com.raapp.codeabbeyTask.problem5;

import java.util.Scanner;

/*
 * Task 5
 * 
 * You will be again given triplets of numbers, 
 * but now the middle of them should be chosen - 
 * i.e. not the largest and not the smallest one. 
 * Such number is called the Median (of the set, array etc).
 * 
 * Input data will contain in the first line the number of triplets to follow.
 * Next lines will contain one triplet each.
 * Answer should contain selected medians of triplets, separated by spaces.
 */
public class MinimumOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			if (a > b)
				a = b;
			if (a > c)
				a = c;
			System.out.print(a + " ");
		}
		scanner.close();
	}

}
