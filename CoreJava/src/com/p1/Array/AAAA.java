package com.p1.Array;

import java.util.Arrays;

public class AAAA {
	public static void main(String[] abc) {
		int a[] = { 1, 2, 5, 4, 0,3 };
		int[] b = { 2, 4, 3, 0, 1 };
		int arr[] = null;
		boolean same = sameArray(a, b);
		System.out.println(same);
	}

	private static boolean sameArray(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a,b)) {
			
			return true;

		} else {
			
			return false;
		}

	}
}
