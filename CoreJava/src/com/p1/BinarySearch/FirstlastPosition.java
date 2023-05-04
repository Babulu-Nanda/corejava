package com.p1.BinarySearch;

public class FirstlastPosition {
	public static void main(String[] abc) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] s = searchChange(arr, target);

		for (int i = 0; i < s.length; i++)
			System.out.println("The Output is :" + s[i]);

	}

	public static int[] searchChange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		// boolean findstartIndex = true;
		int start = search(arr, target, true);
		int end = search(arr, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}

	// this function is return the index value of target
	public static int search(int[] arr, int target, boolean findstartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid])

				end = mid - 1;

			else if (target > arr[mid])
				start = mid + 1;

			else { // potential ans Found
				ans = mid;
				if (findstartIndex)
					end = mid - 1;
				else
					start = mid + 1;

			}
		}
		return ans;
	}
}
