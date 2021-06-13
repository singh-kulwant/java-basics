package com.template.corejava;

public class JavaPassByExamples {

	public static void main(String[] args) {
		Dog a= new Dog("Hannah");
		Dog b = a;
		
		update(a);
		
		System.out.println(a.getName());
		System.out.println(b.getName());
		
	}

	private static void update(Dog dog) {
		dog = new Dog("Jacky");
	}
	
	
}

class Dog {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		super();
		this.name = name;
	}
	
}
