package com.p1.BinarySearch;

public class FlooringNumber {
	
	//*floor=greater number smaller or =target  *arr=[2,3,5,9,14,16,18]  floor of 15.
	
	public static void main(String[] abc) {
		// int[] a={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int[] a = {2,3,5,9,14,16,18};
		int target = 15;
		System.out.println("Floor number:" + floorNumber(a, target));
	}
  //return the index of smalled no>=target
	static int floorNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		//but what if the target is greater than the greatest number in the array 
		if(target>arr[arr.length-1]) return -1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target < arr[mid])

				end = mid - 1;

			else if (target > arr[mid])
				start = mid + 1;

			else
				//ans notFound
				return mid;

		}
		return end;
	}


}
