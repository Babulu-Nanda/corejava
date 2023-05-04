package com.p1.Array.CycleSort;

//Find duplicate array ina given integer array
//EXAMPLE=[3,1,3,4,2] o/p=3
public class Example3 {
	public static void main(String[] abc) {
		int arr[]= {3,1,3,4,2};
		int s=duplicate(arr);
		System.out.println(s);
	}

	public static int duplicate(int[] arr) {
		int i = 0;
		
			while(i<arr.length){
				if(arr[i] !=i+1){
				int correct=arr[i]-1;
				if(arr[i] !=arr[correct]){
				swap (arr, i,correct);
				}
				else{
				return arr[i];
				}
				}
				else{
				 i++;
				 }

				}
				return -1;//For one duplicateValue

		}

	
	
private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}



}
