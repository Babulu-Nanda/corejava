package com.p1.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXample5 {
	//Find the number  that occure twice and that is missing  and return them in the form of an array

	public static void main(String[] abc) {
		int arr[] = { 1,2,2,4 };

		int s[] = duplicate(arr);
		System.out.println(Arrays.toString(s));
	}

	public static int[] duplicate(int[] arr) {
		int i = 0;

		while (i < arr.length) {

			int correct = arr[i] - 1;
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);

			} else {
				i++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1)
				return new int[] { arr[index], index + 1 };
		}

		return new int[] { -1, -1 };
	}

	private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
