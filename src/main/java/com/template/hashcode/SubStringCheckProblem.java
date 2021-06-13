package com.template.hashcode;

import java.io.IOException;
import java.util.Scanner;

public class SubStringCheckProblem {

	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {

		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		for (int i = 0; i < alphabets.length; i++) {
			if (s2.indexOf(alphabets[i]) != -1 && s1.indexOf(alphabets[i]) != -1) {
				return "YES";
			}
		}
		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);
			System.out.println(result);
		}

		scanner.close();
	}
}
