package com.p1.Array.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Find Duplicate

public class Example4 {

	public static void main(String[] abc) {
		int arr[] = { 4,3,2,7,8,2,3,1 };

		List<Integer> s = duplicate(arr);
		System.out.println(s);
	}

	public static List<Integer> duplicate(int[] arr) {
		int i = 0;

		while (i < arr.length) {

			int correct = arr[i]-1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);

			} else {
				i++;
			}
		}
			List<Integer> list = new ArrayList<>();
			for (int index= 0; index< arr.length; index++) {
				if (arr[index] != index + 1)
					list.add(arr[index]);
			}
		
		return list;
	}

	private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
