package com.raapp.codeabbeyTask.problem27;

import java.util.Scanner;

/*
 * Task 27
 * 
 * Bubble Sort is one of the simplest methods to perform such reordering. We will describe it in even simpler way than usual:
 *
 * Take a pass through array, examining all pairs of adjacent elements 
 * N-1 pairs for array of N elements).
 * If in any pair with indexes i and i+1 the condition a[i] <= a[i+1] does not hold, 
 * swap these two elements.
 * Repeat such passes through array until the new pass will do no swaps at all.
 *
 * Input data will contain array size in first line and array itself in the second 
 * (integer values separated with spaces).
 *
 * Answer should contain two values - 
 * number of passes perfromed and total number of swaps made. 
 */
public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] value = new int[num];
		int countPasses = 0;
		int countSwaps = 0;

		// scan input value
		for (int i = 0; i < num; i++)
			value[i] = scanner.nextInt();
		scanner.close();

		// buble sorting
		while (true) {
			int count = 0;
			countPasses++;

			for (int i = 0; i < (num - 1); i++) {
				if (value[i] > value[i + 1]) {
					int temp = value[i];
					value[i] = value[i + 1];
					value[i + 1] = temp;
					count++;
					countSwaps++;
				}
			}

			// end of loop
			if (count == 0)
				break;
		}

		System.out.println(countPasses + " " + countSwaps);

	}

}
