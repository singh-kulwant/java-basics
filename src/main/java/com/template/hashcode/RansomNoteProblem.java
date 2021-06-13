
package com.template.hashcode;

import java.util.Scanner;

public class RansomNoteProblem {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {

		for (int i = 0; i < note.length; i++) {
			boolean match = false;
			String val = note[i].trim();

			for (int j = 0; j < magazine.length; j++) {
				String cont = magazine[j];
				if (cont.equals(val)) {
					magazine[j]="";
					match = true;
					break;
				}
			}
			if (!match) {
				System.out.print("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
