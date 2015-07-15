package com.raapp.codeabbeyTask.problem81;

import java.util.Scanner;

/*
 * Task 81
 * 
 * Input data will contain a number of values to process.
 * Next line will contain the values themselves, each in range 
 * -2 000 000 000 .. 2 000 000 000.
 *
 *Answer should contain the counts of bits set to 1 for each of values, separated by spaces.
 */
public class BitCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int  value = Integer.bitCount(scanner.nextInt());
			System.out.print(value + " ");
		}
		
		scanner.close();
	}

}
