package com.raapp.codeabbeyTask.problem20;

import java.util.Scanner;

/*
 * Task 20
 * 
 * This is a simple problem to get introduced to string processing. 
 * You will be given several lines of text - 
 * and for each of them you should tell the number of vowels (i.e. letters a, o, u, i, e, y). 
 * Note: that y is regarded as vowel for purpose of this task.
 */

//Main class
public class VowelCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		System.out.println("answer:");
		
		//Check all string line by line
		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			VowelCountWork vcw = new VowelCountWork(line);
			int viwel = vcw.numberVowels();
			
			System.out.print(viwel + " ");
		}
		
		scanner.close();

	}

}

//Work class
class VowelCountWork {
	String cheked;

	/**
	 * Constuctor
	 * 
	 * @param cheked
	 */
	VowelCountWork(String cheked) {
		this.cheked = cheked;
	}

	/**
	 * Check number of vowels symbol in string line
	 * 
	 * @return
	 */
	int numberVowels() {
		int vowelCount = 0;
		for (int j = cheked.length() - 1; j >= 0; j--) {// outer loop
			char a = cheked.charAt(j);
			if (isVowels(a)) {
				vowelCount++; // vowel count in text
			}
		}

		return vowelCount;
	}

	/**
	 * Check symbol
	 * 
	 * @param a
	 * @retu3, 678, 114, 834, ..., 337rn
	 */
	boolean isVowels(char a) {
		if ((a == 'a') || (a == 'u') || (a == 'i') || (a == 'o') || (a == 'e')
				|| (a == 'y')) {
			return true;
		}

		return false;
	}
}
