package com.raapp.codeabbeyTask.problem44;

/*
 * Input data will contain the number of test-cases (dice throws) in the first
 * line. Next lines will have test-cases - each consisting of two random integer
 * numbers - for throwing a pair of dice. These numbers are non-negative (from 0
 * to some value above 2,000,000,000) and they should be converted to dice
 * points using the algorithm proposed above.
 * 
 * Answer should contain the sum of each throw of the pair of dice, values
 * should be separated with spaces.
 */
import java.util.Scanner;

/**
 * Calculate double dice roll
 * 
 * @author raapp
 *
 */
public class DoubleDiceRoll {

	public static void main(String[] args) {
		int DICE = 6;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {

			int answer = diceRolling(scanner.nextInt(), DICE)
					+ diceRolling(scanner.nextInt(), DICE);

			System.out.print(answer + " ");

		}
		scanner.close();

	}

	/**
	 * Calculate dice value
	 * 
	 * @param value
	 * @param dice
	 * @return
	 */
	private static int diceRolling(int value, int dice) {
		int answer = value % dice + 1;
		return answer;
	}

}
