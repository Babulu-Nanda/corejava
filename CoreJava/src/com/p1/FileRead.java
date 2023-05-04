package com.p1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {
	public static void main(String[] abc) throws IOException {

		int n = 37;
		//for (int i = 1; i < n; i++) 
		//	System.out.println(i + " " + isPrime(i));
			

		boolean[] primes = new boolean[n + 1];
		//System.out.println(primes[0]);
		sieve(n, primes);

	}

	private static void sieve(int n, boolean[] primes) {
		for (int i = 2; i *i<= n; i++) {
			if (!primes[i]) {
				for(int j=i*2;j<=n;j+=i) {
					primes[j]=true;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (!primes[i]) {
				System.out.println(i+" ");
			}
		}		

	}

	private static boolean isPrime(int i) {
		if (i <= 1)
			return false;
		int c = 2;
		while (c * c < i) {
			if (i % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}
}
