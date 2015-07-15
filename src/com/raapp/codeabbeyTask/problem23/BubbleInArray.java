package com.raapp.codeabbeyTask.problem23;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleInArray {
	private static final int ENDOFARRAY = -1;
	private static int SEED = 113;
	private static int LIMIT = 10000007;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<>();
		int count = 0;
		int checksum;

		// scan array of values
		while (true) {
			values.add(scanner.nextInt());

			// look for last element
			if (values.get(count) == ENDOFARRAY) {
				values.remove(count);
				break;
			}

			count++;
		}
		scanner.close();

		// count of element swap
		count = swapOne(values);

		// calculate checksum
		checksum = checksum(values);

		// print answer
		System.out.println(count + " " + checksum);
	}

	/**
	 * count swap
	 * 
	 * @param values
	 * @return
	 */
	private static int swapOne(ArrayList<Integer> values) {
		// bubble sort. one time
		int temp;
		int count = 0;
		for (int i = 1; i < (values.size()); i++) {
			if (values.get(i) < values.get(i - 1)) {
				count++;
				// swap element
				temp = values.get(i);
				values.set(i, values.get(i - 1));
				values.set((i - 1), temp);
			}
		}
		return count;
	}

	/**
	 * Return checksum
	 * 
	 * @param list
	 * @return
	 */
	private static int checksum(ArrayList<Integer> list) {
		int checksum = 0;
		// get sum all element
		for (int listEl : list) {
			checksum += listEl;
			checksum *= SEED;
			checksum = checkLimit(checksum);
		}
		return checksum;
	}

	/**
	 * check out of limit, return mod
	 * 
	 * @param value
	 * @return
	 */
	private static int checkLimit(int value) {
		if (value >= LIMIT)
			value %= LIMIT;
		return value;
	}
}
