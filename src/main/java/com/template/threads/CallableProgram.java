package com.template.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableProgram {

	public static void main(String[] args) {
		
		FutureTask[] randomTasks = new FutureTask[5];
		
		for (int i = 0; i < randomTasks.length; i++) {
			Callable callable = new CallableClass();
			randomTasks[i] = new FutureTask(callable);
			Thread t = new Thread(randomTasks[i]);
			t.start();
		}
		
		for (int i = 0; i < randomTasks.length; i++) {
			try {
				System.out.println(randomTasks[i].get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}

class CallableClass implements Callable {

	@Override
	public Object call() throws Exception {
		Random gen = new Random();
		Integer num = gen.nextInt(5);

		Thread.sleep(num * 1000);
		return num;
	}

}
