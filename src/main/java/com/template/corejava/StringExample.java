package com.template.corejava;

import java.util.logging.Logger;

public class StringExample {

	static Logger log = Logger.getLogger(StringExample.class.getName());

	public static void main(String[] args) {

		String a = "Scott";
		a.concat("Tiger");

		System.out.println(a);

		booleanAssignment();

		primitiveOperations();
	}

	private static void primitiveOperations() {

		int x = 5, a = 5;

		System.out.println("Before ++x = " + x);

		++x;

		System.out.println("After ++x = " + x);

		int y = ++a + a++ + --a;

		System.out.println("Value of expression (++a + a++ + --a) = " + y);
	}

	private static void booleanAssignment() {
		boolean b = false;

		if (b = true) {
			System.out.println("Assignment Returns Value = " + b);
		} else {
			System.out.println("Assignment doesn't Returns Value = " + b);
		}
	}
}
