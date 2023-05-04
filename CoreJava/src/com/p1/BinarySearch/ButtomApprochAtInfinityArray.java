package com.p1.BinarySearch;

public class ButtomApprochAtInfinityArray {
	public static void main(String[]abc) {
		//start the bugs of size=2
		
		int arr[]= {3,5,7,9,10,90,100,130,140,160,170};
		int target=10;
		System.out.println(ans(arr,target));
		
		//int search=binarySearch();
	}
	static int ans(int[] arr,int target) {
		//first find the range
		int start=0;
		int end=1;
		//condition is for the target lie in the range
		while(target>arr[end]) {
			int newstart=end+1;
			//double the box value
			//end=previousend+sizeof box*2
			end=end+(end-start+1)*2;
			start=newstart;
			
		}
		return binarySearch(arr, target, start, end);
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(target<arr[mid]) end=mid-1;
		else if (target>arr[mid]) start=mid+1;
		else return mid;
	}
	
		return -1;
	}
}
