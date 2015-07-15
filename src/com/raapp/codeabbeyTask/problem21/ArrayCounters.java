package com.raapp.codeabbeyTask.problem21;

/*
 * Task 21
 * 
 * Here is an array of length M with numbers in the range 1 ... N, 
 * where N is less than or equal to 20. You are to go through it and 
 * count how many times each number is encountered.
 * I.e. it is like Vowel Count task, but you have to maintain more than one counter. 
 * Be sure to use separate array for them, do not create a lot of separate variables, 
 * one for each counter.
 *
 * Input data contain M and N in the first line.
 * The second (rather long) line will contain M numbers separated by spaces.
 * 
 * Answer should contain exactly N values, separated by spaces. 
 * First should give amount of 1-s, 
 * second - amount of 2-s and so on.
 */
import java.util.Scanner;

public class ArrayCounters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scan number of values
		int num = scanner.nextInt();
		//scan number of variable values and create array for count
		int[] count = new int[scanner.nextInt()];
		
		//calculate count of values
		for (int i = 0; i < num; i++) {
			int value = scanner.nextInt();
			count[value - 1] ++;
		}
		scanner.close();
		
		//print result
		for (int i:count){
			System.out.print(i + " ");
		}
	}

}
