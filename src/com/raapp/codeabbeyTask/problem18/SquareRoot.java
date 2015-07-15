package com.raapp.codeabbeyTask.problem18;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			//scan value
			double sqrt = scanner.nextDouble();
			double step = scanner.nextDouble();
			
			
			sqrt = squareStepRoot(sqrt, step);
			System.out.print(sqrt + " ");
		}
		scanner.close();

	}

	/**
	 * return square root
	 * 
	 * @param d
	 * @param r
	 * @return
	 */
	private static double squareStepRoot(double sqrt, double step) {
		double d;
		double r = 1;
		for (int i = 0; i < step; i++) {
			d = sqrt / r;
			r = (r + d) / 2;
		}
		return r;
	}

}
