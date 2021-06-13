package com.template.inheritance;

public class InheritenceSample {

	public static void main(String[] args) {

		A a1 = new C();
		a1.a();

		A a2 = new D();
		a2.a();

		B b1 = new D();
		b1.b();

		B b2 = new D();
		b2.b();

		// D d = new C();	
		C c = new D();
	}
}

interface A {
	void a();
}

interface B {
	void b();
}

class C implements A {

	@Override
	public void a() {
		System.out.println("inside C class -> a");
	}

}

class D extends C implements B {

	@Override
	public void b() {
		System.out.println("inside D class -> b");

	}

	@Override
	public void a() {
		System.out.println("inside D class -> a");
	}

}
