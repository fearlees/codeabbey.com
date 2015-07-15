package com.raapp.codeabbeyTask.problem7;
import java.util.Scanner;

/*
 * Task 7
 * 
 * Input data contains N+1 values, first of them is N itself 
 * (Note that you should not try to convert it).
 * Answer should contain exactly N results, rounded to nearest integer and separated by spaces.
 */
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//scan number of value
		int n = scanner.nextInt();

		System.out.println("answer:");
		for (int i = 0; i < n; i++) {
			int far = scanner.nextInt();
			//convert to celsium 
			float celsium = (float) (far - 32) * 5 / 9;
			int celsiumRound = Math.round(celsium);
			//print answer
			System.out.print(celsiumRound + " ");
		}
		scanner.close();

	}

}
