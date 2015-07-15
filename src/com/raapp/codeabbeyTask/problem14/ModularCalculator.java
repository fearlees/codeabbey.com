package com.raapp.codeabbeyTask.problem14;

import java.math.BigInteger;
/*
 * Task 14
 * 
 * Input data will have:
 *
 * initial integer number in the first line;
 * one or more lines describing operations, 
 * in form sign value where sign is either + or * and value is an integer;
 * last line in the same form, but with sign % instead 
 * and number by which the result should be divided to get the remainder.
 * 
 * Answer should give remainder of the result of all operations 
 * applied sequentially (starting with initial number) divided by the last number.
 *
 */
import java.util.Scanner;

public class ModularCalculator {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		BigInteger result = new BigInteger(data.next());
		String ch;
		while (true) {
			// get arithmetic symbol
			ch = data.next();
			// check symbol
			if (ch.equals("*"))
				result = result.multiply(new BigInteger(data.next()));  // ;
			else if (ch.equals("%")) {
				result = result.mod(new BigInteger(data.next()));
				break; // end of loop
			} else
				result = result.add(new BigInteger(data.next()));
		}
		data.close();

		// print result
		System.out.println(result);
	}

}
