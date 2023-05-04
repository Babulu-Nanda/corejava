package com.p1.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFeatureRunAsyncProgram {
	public static void main(String[] abc) throws InterruptedException, ExecutionException {
		CompletableFuture.runAsync(()->{
			System.out.println("My Task1 is Completed");
		});
		System.out.println("------------------");
		CompletableFuture.runAsync(()->{
			System.out.println("My task2 is Completed");
		},Executors.newFixedThreadPool(10));
		
		System.out.println("------------------");
		CompletableFuture<String> suplyasyncc=CompletableFuture.supplyAsync( ()->"Hello World");
		System.out.println(suplyasyncc.get());
		CompletableFuture<String> suplyasyncc1=CompletableFuture.supplyAsync( ()->{
			return "Hello King " ;},Executors.newCachedThreadPool());
		System.out.println(suplyasyncc1.get());
		
		
		}

}
