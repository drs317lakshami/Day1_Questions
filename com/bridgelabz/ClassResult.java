package com.bridgelabz;

import java.util.Scanner;
//Declaration of result using if else if else using scanner and and operator
public class ClassResult {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any value");
		int marks = scanner.nextInt();

		if (marks >= 70 && marks < 101) {
			System.out.println("First Class with Distinction");
		}

		else if (marks >= 60 && marks < 71) {
			System.out.println("First Class");
		}

		else if (marks >= 50 && marks < 61) {
			System.out.println("Second Class");
		}

		else if (marks >= 35 && marks < 51) {
			System.out.println("Just pass");
		}

		else if (marks < 35 && marks >= 0) {
			System.out.println("Fail");
		}

		else {
			System.out.println("Enter the correct marks");
		}

	}

}
