package com.raapp.codeabbeyTask.problem17;

/*
 * Task 17
 * 
 * You will be given the array for which checksum should be calculated. 
 * Perform calculation as follows: for each element of the array (starting from beginning) 
 * add this element to result variable and multiply this sum by 113 - 
 * this new value taken by modulo 10000007 should become the next value of result, and so on.
 *
 * Read the article on checksum for detailed description of this algorithm. 
 * An example of calculation also could be found there.
 *
 * Input data will tell the length of an array in the first line.
 * Array values themselves follow in the second line, separated by spaces.
 *
 * Answer should have a single value - calculated checksum.
 */
import java.util.Scanner;

public class ArrayChecksum {

	public static void main(String[] args) {
		final int LIMIT = 10000007;
		Scanner scanner = new Scanner(System.in);
		long sum = 0;
		
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			//scan next value
			int value = scanner.nextInt();
			
			//calculate checksum
			sum = (sum + value) * 113;
			sum %= LIMIT;
		}
		scanner.close();
		
		//print result
		System.out.print(sum + " ");

	}

}
