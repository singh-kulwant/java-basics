package com.template.corejava;

import java.util.Scanner;

public class ScannerProblemTwo {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int si = 0;
		double sd = 0.0;
		String ss = "";
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		si = Integer.parseInt(scan.nextLine());
		sd = Double.parseDouble(scan.nextLine());
		ss = scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + si);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + sd);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + ss);
		scan.close();
	}
}