package com.template.java8;

interface Animal {
	abstract void legs();
	
	default void defaultMethod() {
		System.out.println(" inside default method!!!!");
	}
	
	default void secondMethod() {
		
	}
}
public class DefaultMethodImpl implements Animal {

	@Override
	public void legs() {
		
	}

}
