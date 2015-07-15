package com.raapp.codeabbeyTask.problem52;

import java.util.Scanner;

/*
 * Task 52
 * 
 * Input data contains the number of triangles in the first line.
 * Next lines describe one triangle each. Descriptions consist of three values - lengths of sides. 
 * Largest value would always be the last of three for simplicity.
 *
 * Answers should have one of the letters R (right), A (acute) or O (obtuse) for each of triangles. 
 * Letters should be separated by spaces.
 */

public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int cathetus1 = scanner.nextInt();
			int cathetus2 = scanner.nextInt();
			int hypotenuse = scanner.nextInt();

			System.out.print(pythT(cathetus1, cathetus2, hypotenuse) + " ");
		}
		scanner.close();

	}

	/**
	 * Returns the form of a triangle
	 * 
	 * @param cath1
	 * @param cath2
	 * @param hyp
	 * @return
	 */
	private static char pythT(int cath1, int cath2, int hyp) {
		char answer;

		int squareCath = (int) (Math.pow(cath1, 2) + Math.pow(cath2, 2));
		int squareHyp = (int) Math.pow(hyp, 2);
		
		if (squareCath == squareHyp)
			answer = 'R';
		else if (squareCath > squareHyp)
			answer = 'A';
		else
			answer = 'O';

		return answer;

	}

}
