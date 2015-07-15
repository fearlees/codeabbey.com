package com.raapp.codeabbeyTask.problem67;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Task 67
 * 
 * Input data contain the amount of Fibonacci numbers to process.
 * Next lines contain one Fibonacci number each (from the first 1000 values).
 * 
 * Answer should contain their indices in the sequence, separated by spaces.
 */
public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("input data:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println("answer:");

		for (int i = 0; i < num; i++) {
			BigInteger value = scanner.nextBigInteger();
			int count = fibonacciIterative(value);

			System.out.print(count + " ");
		}
		scanner.close();

	}

	private static int fibonacciIterative(BigInteger value) {
		int count = 0;
		BigInteger fibo1 = BigInteger.ONE;
		BigInteger fibo2 = BigInteger.ONE;
		BigInteger fibonacci = BigInteger.ZERO;
		boolean notZero = true;

		if (value.compareTo(fibonacci) == 0)
			notZero = false;

		while (notZero) {
			count++; // count number of loop

			if (count == 1 || count == 2) {
				fibonacci = fibo1;
			} else {
				fibonacci = fibo1.add(fibo2);
				fibo1 = fibo2;
				fibo2 = fibonacci;
			}

			if (fibonacci.compareTo(value) == 0)
				break; // end WHILE loop
		}
		return count;
	}
	
}
