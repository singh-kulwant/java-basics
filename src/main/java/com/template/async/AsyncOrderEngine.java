package com.template.async;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncOrderEngine {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(10);

		System.out.println("*****" + Thread.currentThread().getName());

		asyncOrdering();

		sequentialOrdering(service);

		System.out.println("*****" + Thread.currentThread().getName());
	}

	private static void sequentialOrdering(ExecutorService service) throws InterruptedException, ExecutionException {
		for (int i = 1; i < 11; i++) {

			System.out.println("Order # " + i);
			Future<Integer> future2 = service.submit(() -> enrighInteger());
			Integer intObj = future2.get();

			Future<Integer> future3 = service.submit(() -> performPayment());
			intObj = future3.get();

			Future<Integer> future4 = service.submit(() -> dispatch());
			intObj = future4.get();

			Future<Integer> future5 = service.submit(() -> sendEmail());
			intObj = future5.get();

			System.out.println(intObj);
		}
	}

	private static void asyncOrdering() {
		for (int i = 1; i < 11; i++) {

			System.out.println("Order # " + i);
			CompletableFuture.supplyAsync(() -> {
				try {
					return enrighInteger();
				} catch (InterruptedException e3) {
					e3.printStackTrace();
				}
				return null;
			}).thenApply(var -> {
				try {
					return performPayment();
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
				return var;
			}).thenApply(var -> {
				try {
					return dispatch();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				return var;
			}).thenAccept(var -> {
				try {
					sendEmail();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}

	public static Integer enrighInteger() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Enrich Order");
		Thread.sleep(5000);
		return new Random().nextInt();
	}

	public static Integer performPayment() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Order Payment");
		Thread.sleep(5000);
		return new Random().nextInt();
	}

	public static Integer dispatch() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Order Dispatch");
		Thread.sleep(5000);
		return new Random().nextInt();
	}

	public static Integer sendEmail() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Email Order");
		Thread.sleep(5000);
		return new Random().nextInt();
	}
}