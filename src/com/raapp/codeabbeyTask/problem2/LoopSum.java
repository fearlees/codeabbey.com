package com.raapp.codeabbeyTask.problem2;

import java.util.Scanner;

/*
 * Task 2
 * 
 * Now your goal is to learn programming loops - i.e. repeated actions. 
 * You are to find sum of several numbers (more than two). 
 * It will be useful to do this in loop. 
 * Perhaps "for" loop will suit nicely since the amount of values for summation is given.
 */
public class LoopSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum += scanner.nextInt();
		}

		scanner.close();
		System.out.println(sum);
	}
}
