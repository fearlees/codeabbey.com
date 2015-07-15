package com.raapp.codeabbeyTask.problem55;

/*
 * Task 55
 * 
 * Input data consist of about 300 words, each made of 3 Latin letters. 
 * The end is signalized by the word end.
 * 
 * Answer should contain all the words which are encountered more than once in lexicographic order.
 *
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MatchingWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> inputValue = new HashSet<>();
		Set<String> duplicateValue = new TreeSet<>();

		// scan input value and check repeat value
		while (true) {
			boolean repeat;
			// scan value
			String temp = scanner.next();
			// looking for the end of the collection
			if (temp.equals("end"))
				break;
			// check repeating
			repeat = inputValue.add(temp);
			// add repeated value
			if (!repeat)
				duplicateValue.add(temp);
		}
		// close scaner
		scanner.close();
		// clear memory
		inputValue.clear();
		

		// print answer
		for (String str : duplicateValue)
			System.out.print(str + " ");

	}

}
