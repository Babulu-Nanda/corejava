package com.p1.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsyncDemo {
	public static void main(String[] abc) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFeature=CompletableFuture.supplyAsync(()->"Beautifull");
	 completableFeature=completableFeature.thenApply(s->s+" World");
	 String result=completableFeature.get();
	 System.out.println(result);
	}
}



