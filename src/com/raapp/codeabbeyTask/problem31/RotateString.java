package com.raapp.codeabbeyTask.problem31;

/*
 * Task 31
 * 
 * Input data will contain the number of test-cases in the first line.
 * Following lines will contain number K and some string S separated by space - one pair in each line.
 * String S will contain only small latin letters. 
 * K will not exceed half the length of S by absolute value.
 *
 * Answer should contain strings rotated in accordance with the rule above, separated by spaces. 
 */
import java.util.Scanner;

public class RotateString {
	static char[] str = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int rotateNumber = scanner.nextInt();
			String temp = scanner.next();
			System.out.println("String= " + temp);
			str = temp.toCharArray();
			
			temp = null;

			for (int j = 0; j < str.length; j++) {
				int last = (str.length - 1 - rotateNumber + j)
						% (str.length - 1);
				change(j, last);
			}

			// print answer
			System.out.println("char= " + new String(str) + " ");

		}
		
		scanner.close();

	}

	private static void change(int first, int last) {
		char temp = str[first];
		str[first] = str[last];
		str[last] = temp;
	}

}
