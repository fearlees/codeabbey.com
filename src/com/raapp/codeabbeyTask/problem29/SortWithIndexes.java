package com.raapp.codeabbeyTask.problem29;

/*
 * Task 29
 * 
 * Initial data will contain array size at first line and array values itself in the second 
 * (integers separated by spaces).
 * 
 * Answer should contain initial indexes of the array members disturbed by sorting.
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortWithIndexes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		TreeMap<Integer, Integer> value = new TreeMap<>();

		// scan input value
		for (int i = 1; i <= num; i++) {
			value.put(new Integer(scanner.nextInt()), new Integer(i));
		}
		scanner.close();

		// print result
		for (Map.Entry<Integer, Integer> entry : value.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}

}
