package com.template.corejava;

/**
 * 
 * An instance method cannot override a static method, and a static method
 * cannot hide an instance method.
 * 
 * @author root
 *
 */
public class StaticMethods {

	public static void main(String[] args) {

		/**
		 * For static methods, the method according to the type of reference is called,
		 * not according to the object being referred, which means method call is
		 * decided at compile time.
		 */
		SuperClass a = new SuperClass();
		a.show();
		SuperClass.show();

		System.out.println("------------------------");

		SuperClass b = new Slave();
		b.show();
		Slave.show();

		System.out.println("------------------------");

		SuperClass c = new Master();
		c.show();
		Master.show();

		System.out.println("------------------------");

		Slave.show(3);

	}
}

class SuperClass {

	void show(double x) {
		System.out.println("***Non static method of SuperClass class");
	}

	/**
	 * 
	 * void show() {... }
	 * 
	 * We can not overload two methods, if they differ only by static keyword
	 * (number of parameters and types of parameters is same)
	 * 
	 */

	static void show() {
		System.out.println("***Staic show method  of SuperClass class!!");
	}

	/**
	 * We can overload static methods by having two ore more static methods with
	 * same name, but differences in input parameters
	 * 
	 * @param x
	 */
	static void show(int x) {
		System.out.println("***Static show with int return of SuperClass class!!!");
	}
}

class Master extends SuperClass {

	/**
	 * Can we Override static methods in java? We can declare static methods with
	 * same signature in subclass, but it is not considered overriding as there
	 * won’t be any run-time polymorphism. Hence the answer is ‘No’.
	 */
	static void show() {
		System.out.println("static show of Master class");
	}

}

class Slave extends Master {

	/**
	 * The only difference with inherited static (class) methods and inherited
	 * non-static (instance) methods is that when you write a new static method with
	 * the same signature, the old static method is just hidden, not overridden.
	 */
	static void show() {
		System.out.println("static show of Slave class");
	}
}
