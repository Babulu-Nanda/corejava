package com.p1.Array;

public class Example2 {
	public static void main(String[] abc) {

		int arr[] = { 3, 4, 7, 12 };
		int n = arr.length;

		int p = peakElement(arr, n);
		System.out.println(p);

	}

	public static int peakElement(int[] arr,int n)
	{
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;
		
		for (int i = 1; i < n - 1; i++) {
			
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}
}