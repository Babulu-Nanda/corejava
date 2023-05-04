package com.p1;

public class SubArray1 {

	public static void subArraySum(int arr[], int n, int sum) {
		for (int i = 1; i < n; i++) {
			int sumelement = arr[i];
			if (sumelement == sum)
				System.out.println("the sum Element is found in " + arr[i]);
			else {
				for (int j = i + 1; j < n; j++) {
					sumelement += arr[j];
					if (sumelement == sum)
						System.out.println("the sum Element is found in  index no" + arr[i] +""+"and"+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 15, 2, 5, 8, 4, 5, 10, 23 };
		int n = arr.length;
		int sum = 9;
		subArraySum(arr, n, sum);
	}
}
