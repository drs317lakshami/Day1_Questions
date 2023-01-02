package com.bridgelabz;

import java.util.Scanner;

 //Printing all data types using scanner 
public class PrintingAllDataTypes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any value");
		byte Byte = scanner.nextByte();
		System.out.println("Given number is Byte " + Byte);

		System.out.println("Enter any value");
		short Short = scanner.nextShort();
		System.out.println("Given number is Short " + Short);

		System.out.println("Enter any value");
		int Integer = scanner.nextInt();
		System.out.println("Given number is integer " + Integer);

		System.out.println("Enter any value");
		long Long = scanner.nextLong();
		System.out.println("Given number is Long " + Long);

		System.out.println("Enter any value");
		float Float = scanner.nextFloat();
		System.out.println("Given number is float  " + Float);

		System.out.println("Enter any value");
		double Double = scanner.nextDouble();
		System.out.println("Given number is Double " + Double);

		System.out.println("Enter any value");
		char character = scanner.next().charAt(3);
		System.out.println("Given number is character  " + character);

		System.out.println("Enter any value");
		boolean Boolean = scanner.nextBoolean();
		System.out.println("Given number is boolean " + Boolean);

	}

}
