package com.in.template.async;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutures {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);

		//submit task and accept the placeholder object for return value
		Future<Integer> future = service.submit(new MyTask());

		try {
			//get the task return value
			Integer result = future.get(); // blocking
			System.out.println("Result from task is: " + result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}

}