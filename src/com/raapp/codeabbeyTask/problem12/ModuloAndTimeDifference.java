package com.raapp.codeabbeyTask.problem12;

/*
 * Task 12
 * 
 * Input data: the first line contains number of test-cases, 
 * other lines contain test-cases themselves.
 * Each test-case contains 8 numbers, 
 * 4 for each timestamp: day1 hour1 min1 sec1 day2 hour2 min2 sec2 
 * (second timestamp will always be later than first).
 * 
 * Answer: for each test-case you are to output 
 * difference as following (days hours minutes seconds) 
 * - please note brackets - separated by spaces.
 */
import java.util.Scanner;

public class ModuloAndTimeDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			// get first date
			int firstDate = mathDate(scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt(), scanner.nextInt());
			// get last date
			int lastDate = mathDate(scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt(), scanner.nextInt());
			// calculate difference
			int difference = lastDate - firstDate;
			// print result
			System.out.print("(" + printDate(difference) + ") ");

		}
		scanner.close();
	}

	/**
	 * Turn Date format into int (second)
	 * 
	 * @param day
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	private static int mathDate(int day, int hour, int minute, int second) {
		int result;
		result = second + (minute + (hour + day * 24) * 60) * 60;
		return result;
	}

	/**
	 * Print Date format from int (second) format: day hour minute second
	 * 
	 * @param date
	 * @return
	 */
	private static String printDate(int date) {
		String dateStr;
		int second = date % 60; // get second
		date = (date - second) / 60; // turn time in minute
		int minute = date % 60; // get minute
		date = (date - minute) / 60; // turn time in hour
		int hour = date % 24; // get hour
		date = (date - hour) / 24; // turn time in day
		int day = date; // get day
		dateStr = day + " " + hour + " " + " " + minute + " " + second;
		return dateStr;

	}

}
