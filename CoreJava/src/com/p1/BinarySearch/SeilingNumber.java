package com.p1.BinarySearch;

class SeilingNumber {
//arr[]=[2,3,5,9,14,16,18] target=14
//Seiling no mean smallest element in array greater or= target
//ceiling (arr,target=14)=14
//ceiling(arr,target=15)=16 <greater element  of one>
//Question1=Find the floor of a number  *floor=greater number smaller or =target  *arr=[2,3,5,9,14,16,18]  floor of 15.

	public static void main(String[] abc) {
		// int[] a={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int[] a = {2,3,5,9,14,16,18};
		int target = 15;
		System.out.println(" ceiling number" + ceilingNumber(a, target));
	}
  //return the index of smalled no>=target
	static int ceilingNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		// Find wheather the array is sorted in assending or desending
		

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target < arr[mid])

				end = mid - 1;

			else if (target > arr[mid])
				start = mid + 1;

			else
				return mid;

		}
		return start;//index no
		
	}

}
