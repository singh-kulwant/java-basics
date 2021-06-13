package com.template.java8;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {

		anonymousClassImpl();

		lambdaExpressionImpl();

		customFunctionalInterfaceImpl();

	}

	/**
	 * Functional Interface implementation using Anonymous Class
	 */
	private static void anonymousClassImpl() {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread started!!!");
			}
		});

		System.out.println(t.getName() + " created using Anonymous Class");
		t.start();
	}

	/**
	 * Functional Interface implementation using Lambda Expression
	 */
	private static void lambdaExpressionImpl() {
		Thread tNew = new Thread(() -> System.out.println("Thread started!!!"));
		System.out.println(tNew.getName() + " created using Lambda Expression");
		tNew.start();
	}

	private static void customFunctionalInterfaceImpl() {
		System.out.println("\n\n***Custom Functional Interface Program***");

		Human neanthredals = new Human(new Fart() {
			@Override
			public void farting(String who) {
				System.out.println(who + " called. " + "Anonymous Impl of fart functional interface!!!");
			}
		}, "neanthredals");

		neanthredals.farting("neanthredals");

		Human sapiens = new Human((s) -> System.out.println(s + " ate Pizza." + "Lambda expression impl of fart"),
				"sapiens");
		sapiens.farting("sapiens");
	}

}

class Human implements Fart {

	public Human(Fart humanFart, String who) {
		humanFart.farting(who);
	}

	@Override
	public void farting(String who) {
		System.out.println(who + " farting!!!");
	}

}

/**
 * Functional Interface Fart
 * 
 * @author root
 *
 */
@FunctionalInterface
interface Fart {

	default void eating() {
		System.out.println("Default method of functional interface fart!!!");
	}

	void farting(String who);
}