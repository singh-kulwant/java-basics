package com.template.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		long n = Long.parseLong(nm[0]);
		long[] a = new long[(int) n + 1];

		long result = 0;
		long m = Long.parseLong(nm[1]);

		for (long i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			long p = Long.parseLong(queriesRowItems[0]);
			long e = Long.parseLong(queriesRowItems[1]);
			long k = Long.parseLong(queriesRowItems[2]);

			if (p < n + 1) {
				a[(int) p] = a[(int) p] + k;
			}
			if (e + 1 < n + 1) {
				a[(int) e + 1] = a[(int) e + 1] - k;
			}
		}

		for (int q = 1; q < n + 1; q++) {
			a[q] = a[q] + a[q - 1];
			if (result < a[q]) {
				result = a[q];
			}
		}

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();

	}
}
