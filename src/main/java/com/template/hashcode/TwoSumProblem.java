package com.template.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumProblem {

	// Complete the whatFlavors function below.
	static void whatFlavors(int[] cost, int money) {

		Map<Integer, Integer> vals = new HashMap<Integer, Integer>();

		for (int i = 0; i < cost.length; i++) {

			int rem = money - cost[i];

			if (vals.containsKey(rem)) {
				System.out.println(vals.get(rem) + " " + (i + 1));
				return;
			}
			vals.put(cost[i], i + 1);

		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int money = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] cost = new int[n];

			String[] costItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int costItem = Integer.parseInt(costItems[i]);
				cost[i] = costItem;
			}

			whatFlavors(cost, money);
		}

		scanner.close();
	}
}
