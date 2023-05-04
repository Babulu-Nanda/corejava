package com.p1.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumnoofArray {
	public static void main(String[] abc) {
		int arr[] = { 4, 2,2, 2, 3, 4, 4, 4, 3, 2};
		int k = firstElementOccureKtime(arr, arr.length);
		System.out.println(k);
		System.out.println(checkElemnt(arr, arr.length));
	}

	private static int checkElemnt(int[] arr, int length) {
		return 0;
	}

	private static int firstElementOccureKtime(int[] arr, int length) {
		int i = 0, repeatnum = 0;
		Set<Integer> set = new HashSet<>();
		for (i =0;i< length - 1; i++) {

			if (set.contains(arr[i]))
				repeatnum = +arr[i];
			else
				set.add(arr[i]);

		}

		return repeatnum;
	}

}