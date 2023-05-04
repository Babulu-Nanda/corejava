package com.p1;

public class Kthpart {

	public static void main(String[] args) {
		int a[] = { 0, 5, 5, 4, 4 };
		int x = 0;
		int n = a.length;
		System.out.println(frequency(a, n, x));
	}

	private static int frequency(int[] a, int n, int x) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				count++;

		}
		return count;
	}
}