package com.template.corejava;

/**
 * * Method Overloading with null
 * 
 * @author singh.kulwant@gmx.com
 *
 */
public class OverloadingNullExample {

	public void start(Integer o) {
		System.out.println("Object method called!!");
	}

	public void start(String s) {
		System.out.println("String method called!!");
	}

	public static void main(String[] args) {

		OverloadingNullExample obj = new OverloadingNullExample();

		/**
		 * 
		 * obj.start(null);
		 * 
		 * We get compile time error for obj.start(null), because the method arguments
		 * Integer and String both are not primitive data types in Java. That means they
		 * accept null values. When we pass a null value to the 'start' the compiler
		 * gets confused which method it has to select, as both are accepting the null.
		 * Compile time error would happen unless we change any methods parameter.
		 * 
		 * 
		 * Integer a = null; obj.start(a);
		 * 
		 * For above scenario if the “a” value is null due to the result of the
		 * expression, then the null value is passed to method1. Here we wouldn’t get
		 * compile time error because we are specifying that the argument is of type
		 * Integer, hence the compiler selects the method1(Integer o) and will execute
		 * the code inside that.
		 */

		Integer a = null;
		obj.start(a);

	}

}
