package com.p1.Array;

public class ZigZagArray {
	public static void main(String[] abc) {
		int arr[] = { 1, 4, 3, 5, 7, 6 };
		zigzag(arr);
		for (int i = 0; i < arr.length - 1; i++)
			System.out.println(arr[i]);

	}

	private static void zigzag(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {

					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}