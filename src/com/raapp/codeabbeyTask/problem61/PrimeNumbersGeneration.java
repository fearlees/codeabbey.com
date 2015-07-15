package com.raapp.codeabbeyTask.problem61;

/*
 * Task	 61
 * 
 * Input data will contain the amount of primes to print in the first line.
 * Next line will contain indices of array of primes for which values should be printed. 
 * They will be in range from 1 to 200000.
 *
 * Answer should contain prime numbers corresponding the specified positions of the array.
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersGeneration {

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<>(200000);
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = 3;

		// add first few values
		prime.add(2);
		prime.add(3);

		do {
			boolean composite = false;
			temp += 2; // next checking value

			for (int primeT : prime) {
				// check
				composite = checkPrime(primeT, temp);
				// break if composite
				if (composite)
					break;

				if (primeT > Math.sqrt(temp))
					break;
			}

			if (!composite)
				prime.add(temp);

		} while (prime.size() < 200000);

		// print answer
		for (int i = 0; i < num; i++) {
			int index = scanner.nextInt();
			System.out.print(prime.get(index - 1) + " ");
		}

		scanner.close();

	}

	private static boolean checkPrime(int prime, int check) {
		if ((check % prime) == 0)
			return true;
		return false;
	}
}
