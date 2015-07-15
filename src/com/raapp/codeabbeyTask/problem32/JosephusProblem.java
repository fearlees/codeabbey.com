package com.raapp.codeabbeyTask.problem32;

import java.util.Scanner;

/*
 * Task 32
 * 
 * Input data will contain number of people N and the counting step K.
 * 
 * Answer should contain the number of person who will remain at the end. 
 * Initial numbering starts from 1.
 * 
 * Input Data: 56 8
 *
 */
public class JosephusProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer;
		int inputN = scanner.nextInt();
		int inputK = scanner.nextInt();
		scanner.close();

		// calculate answer
		answer = generateJosephus(inputN, inputK);

		// print answer
		System.out.println(answer);

	}

	/**
	 * Recursive method for calculating the solutions of Josephus problem
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	private static int generateJosephus(int n, int k) {
		int answer;
		if (n != 1) {
			answer = ((generateJosephus(n - 1, k) + k - 1) % n) + 1;
		} else
			return 1;
		return answer;
	}

}
