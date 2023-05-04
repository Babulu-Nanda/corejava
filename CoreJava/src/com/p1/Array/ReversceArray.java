package com.p1.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReversceArray {

	public static void main(String args[]) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		int k = 3;

		int n = arr.size();

		List<Integer> arr1=reverse(arr, n, k);
		for (Integer i : arr1)
			System.out.println(i + " ");

	}

	static List<Integer> reverse(List<Integer> arr, int n, int k) {
	      		//List<Integer> alist=new ArrayList<>();
			Integer[] a = arr.toArray(new Integer[n]);
			for (int i = 0; i < n; i += k) {
				int start = i;
				int end = Math.min(i + k - 1, n - 1);
				// System.out.println(end);
				int temp;
				while (start < end) {
					temp = a[start];
					a[start] = a[end];
					a[end] = temp;
					start++;
					end--;
				}
			
				
			}
			List<Integer> alist = Arrays.asList(a);
			return alist;

		}
}
