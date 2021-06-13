package com.template.threads;

public class RunnableThreadProgram implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " processing...");
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new RunnableThreadProgram());
			t.start();
		}
	}
}
