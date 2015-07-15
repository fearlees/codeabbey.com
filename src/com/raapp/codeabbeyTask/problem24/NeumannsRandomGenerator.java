package com.raapp.codeabbeyTask.problem24;

import java.util.HashSet;
/*
 * Task 24
 * 
 * Here is one of the earliest methods for producing sequence of seemingly independed 
 * (i.e. pseudorandom) numbers:
 *
 * Choose some initial value with 4 digits (i.e. in range 0000 ... 9999).
 * Multiply it by itself (i.e. raise to power 2) to get value consisting of 8 digits 
 * (add leading zeroes if necessary).
 * Truncate two first and two last digits in decimal representation of this result.
 * New value will contain 4 digits and it is the next value of a sequence.
 * To get more values, repeat from step 2.
 *
 */
import java.util.Scanner;

public class NeumannsRandomGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// check all value
		for (int i = 0; i < num; i++) {
			HashSet<Integer> setVal = new HashSet<Integer>();
			int countBeforLoop = 0;
			int nextValue = scanner.nextInt();
			// check one value
			while (true) {
				// add value to Set collection
				setVal.add(nextValue);
				// get middle of next value
				nextValue = middle((nextValue * nextValue));
				// count number of nextValues before came to loop
				countBeforLoop++;
				// end of loop
				if (setVal.contains(nextValue))
					break;
			}
			// print result
			System.out.print(countBeforLoop + " ");
		}
		scanner.close();

	}

	/*
	 * private static int middle(int val) { // string version 
	 * String valueS = String.format("%08d", val); 
	 * valueS = valueS.substring(2, 5); 
	 * return Integer.parseInt(valueS); }
	 */

	private static int middle(int val) { // integer version
		val /= 100;
		val %= 10000;
		return val;
	}

}
