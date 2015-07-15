package com.raapp.codeabbeyTask.problem30;

/*
 * Task 30
 * 
 * Input data: "about interrogative stay end clown fare cactus stove keep"
 * 
 * Input data will contain a single string of small latin letters and few spaces.
 * 
 * Answer should contain the string of the same length with the same characters but in reverse order.
 */
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan input string
		char[] ch = scanner.nextLine().toCharArray();

		for (int i = 0; i < (ch.length / 2); i++) {
			// create a temporary variable
			char temp = ch[i];
			// last in begin
			ch[i] = ch[ch.length - i - 1];
			// temporary in last
			ch[ch.length - i - 1] = temp;
		}
		scanner.close();
		// print result
		System.out.println(ch);
	}
}
