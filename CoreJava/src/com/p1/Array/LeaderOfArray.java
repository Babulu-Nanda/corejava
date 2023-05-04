package com.p1.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class LeaderOfArray {
	public static void main(String[] abc) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };

		// List<Integer> list=ladderArray(arr);
		List<Integer> list = ladder(arr, arr.length);
		System.out.println(list);

	}

	private static List<Integer> ladder(int arr[], int length) {
		int size = length;
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[size - 1]);
		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] >= stack.peek()) {
				stack.push(arr[i]);
			}
		}

		while (!stack.empty()) {
			list.add(stack.pop());
		}
		return list;
	}

	private static List<Integer> ladderArray(int[] arr) {
		int size = arr.length;
		List<Integer> al = new ArrayList<>();
		int max_from_right = arr[size - 1];
		// int max_from_right=arr[0];

		al.add(max_from_right);

		for (int i = size - 2; i >= 0; i--) {
			if (max_from_right < arr[i]) {
				max_from_right = arr[i];
				al.add(max_from_right);
			}
		}
		Collections.reverse(al);
		return al;
	}
}
