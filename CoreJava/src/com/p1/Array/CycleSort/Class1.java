package com.p1.Array.CycleSort;

import java.util.Arrays;

public class Class1 {
	public static void main(String[] abc) {
		int[] arr = { 3, 5, 2, 1, 4 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}
private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
