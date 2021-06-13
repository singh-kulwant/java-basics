package com.template.corejava;

class Head {

	public Head() {
		System.out.println("***Parent Constructor");
	}

	static {
		System.out.println("***Parent Static Block");
	}

	{
		System.out.println("***Parent Instance Block");
	}
}

class Tail extends Head {
	public Tail() {
		System.out.println("***Child Constructor");
	}

	static {
		System.out.println("***Child Static Block");
	}

	{
		System.out.println("***Child Instance Block");
	}
}

public class JavaBlocks {

	public static void main(String[] args) {
		Tail t = new Tail();
	}
}
