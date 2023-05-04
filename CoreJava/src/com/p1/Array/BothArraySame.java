package com.p1.Array;

import java.util.Arrays;

public class BothArraySame {
	public static void main(String[] abc) {
		int a[] = { 1, 2, 5, 4, 0 };
		int[] b = { 2, 4, 3, 0, 2 };
		int arr[] = null;

		Arrays.sort(a);
		Arrays.sort(b);
		if (a == b) {
			System.out.println("same");

		} else {
			System.out.println("Not same");
		}

	}
}
