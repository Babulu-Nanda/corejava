package com.p1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindNegetiveAarray {
	public static void main(String[] abc) {
		int N = 8;
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				list.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				list.add(arr[i]);
		}
		for (Integer i : list)
			System.out.println(i);
	}
}
