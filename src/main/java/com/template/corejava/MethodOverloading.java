package com.template.corejava;

/**
 * Method overloading can be done by changing:
 * 
 * The number of parameters in two methods. The data types of the parameters of
 * methods. The Order of the parameters of methods.
 * 
 * 
 * What happens when method signature is same and the return type is different?
 * 
 * The compiler will give error as the return value alone is not sufficient for
 * the compiler to figure out which function it has to call.
 * 
 * @author root
 *
 */
public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println("***Primitive Method called!!");
	}

	/**
	 * The number of parameters in two methods.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public void add(int a, int b, int c) {
		System.out.println("***Primitive Method with 3 arguments is called!!");
	}

	/**
	 * The data types of the parameters of methods.
	 * 
	 * @param d
	 * @param i
	 */
	public void add(double d, int i) {
		System.out.println("***double int Method called!!");
	}

	/**
	 * The Order of the parameters of methods.
	 * 
	 * @param i
	 * @param d
	 */
	public void add(int i, double d) {
		System.out.println("***int double Method called!!");
	}

	public void add(Integer a, Integer b) {
		System.out.println("***Wrapper Method called!!");
	}

	public void add(Object a, Object b) {
		System.out.println("***Object argument method!!");
	}

	public static void main(String[] args) {

		Integer a = Integer.valueOf(5);

		MethodOverloading obj = new MethodOverloading();

		obj.add(5, 5);

		obj.add(null, null);

		obj.add(a, a);

		obj.add(2.3, 2);

		obj.add("s", "g");

	}
}
