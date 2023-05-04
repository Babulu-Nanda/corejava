package com.p1.Array;

import java.util.Arrays;

public class MissingNumber {
	static int MissingNumber(int arr[]) {
		int n = arr.length;
		int missingno = 1;
		for (int i = 2; i <= (n + 1); i++) {
			missingno += i;
			missingno -= arr[i - 2];
		}
		return missingno;
	}

	// Driver Code
	public static void main(String[] args) {
		int numbers[] = { 9, 6, 4, 5, 7, 0, 1 };
		// System.out.println("Missing nO :"+MissingNumber(numbers));
		int[] a = { 0, 12, 14, 15, 32 };
		System.out.println("Missing number2:" + missingNumber2(numbers));
		Arrays.sort(numbers);
		int i = 1;

		while (i < numbers.length) // i=1
		{
			if (numbers[i] - numbers[i - 1] == 1) {
			} else {
				System.out.println("Missing number is " + (numbers[i - 1] + 1));
			}
			i++;
		}
	}

	private static String missingNumber2(int[] ac) {
		int[] a = { 0, 12, 14, 15, 32 };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > 1) {
				int temp = a[i + 1] - a[i];
				for (int j = 1; j < temp; j++) {
					System.out.print("Missing number========" + a[i] + j + " ");
				}
				temp = 0;
			}

		}
		
		return null;
	}
}
