package com.p1.BinarySearch;

public class peakMountainArray {
	public static void main(String[] abc) {
		// Mountain Array means increase First then decrease or it is also known as
		// bitonic Array

		int[] arr = { 0, 2, 1,0 };
		System.out.println("PeakElement:"+peakIndexInMountain(arr));
	}

	public static int peakIndexInMountain(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// we are in decreasing part of an Array this may be the ans but look at left
				// this is end!=mid-1;
				end = mid;
			} else {
				// we are in asending  part of an Array
				start = 
						mid + 1;// weknow that mid+1 element> mid element

			}

		}//in the end start==end and pointing to the largest no because of the 2 chck above
		//when start==end i.e always try to find the max element
		return start;
	}

}




