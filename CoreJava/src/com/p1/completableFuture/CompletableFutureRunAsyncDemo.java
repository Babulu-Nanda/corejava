package com.p1.completableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureRunAsyncDemo {

	public static void main(String[] abc) {
		CompletableFuture<String> completefuture = calculateAsync();
		try {
			String result=completefuture.get();
			System.out.println(result);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}

	public static CompletableFuture<String> calculateAsync() {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		List<String> list = new ArrayList<>();
		list.add("KK");
		list.add("PK");
		list.add("SK");

		Executors.newCachedThreadPool().submit(() -> {
			try {
				Thread.sleep(20);
				String joins = String.join(",", list);
				System.out.println(Thread.currentThread().getName());
				System.out.println("------------");
				completableFuture.complete(joins);
				
				return null;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return null;
			
		});
		return completableFuture;
	}
}
