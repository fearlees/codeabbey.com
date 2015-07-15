package com.raapp.codeabbeyTask.problem28;

/*
 * Task 28
 * 
 * The simple measure of body constitution was proposed at the middle of XIX century.
 * It depends only on the height and weight of a person 
 * - and is called Body Mass Index or BMI.
 * 
 * Input data contain number of people in the first line.
 * Other lines will contain two values each - weight in kilograms and height in metres.
 * Answer should contain words under, normal, over, obese 
 * for each corresponding test-case, separated with spaces. 
 * 
 */
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Check number of line
		int n = scanner.nextInt();
		float[][] arr = new float[n][2];

		System.out.println("answer:");
		// Check all line one by one
		for (int i = 0; i < n; i++) {
			String str;
			BMI bmi;

			// Turn weight and height from input data
			arr[i][0] = scanner.nextFloat();
			arr[i][1] = scanner.nextFloat();

			bmi = new BMI(arr[i][0], arr[i][1]);
			str = bmi.stringBMI();

			System.out.print(str + " ");
		}
		scanner.close();

	}

}

class BMI {
	float bmi;

	/**
	 * Constructor
	 * 
	 * @param weight
	 * @param height
	 */
	BMI(float weight, float height) {
		bmi = weight / (height * height);
	}

	/**
	 * Answer
	 * 
	 * @return
	 */
	String stringBMI() {
		String str;

		if (bmi < 18.5)
			str = "under";
		else {
			if (bmi < 25)
				str = "normal";
			else {
				if (bmi < 30)
					str = "over";
				else
					str = "obese";
			}
		}
		return str;
	}
}