package com.p1.Array.CycleSort;

import java.util.Arrays;

//print the missing no of an Array
public class Example2 {

	public static void main(String[] abc) {
		int arr[]= {3,0,1};
		int s=sort(arr);
		System.out.println(s);
	}

	public static int sort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length &&arr[i]!= arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		//search For missing No
		for(int index=0;index<arr.length;index++) {
		if(arr[index]!=index)
		return index;
		}
		return arr.length;
	}
	
private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}


public static String getMyData(String s) {
	
	String mydata = "";
	
	if(s==mydata) {
		mydata = "Rohit";
		}
	else {
		mydata="Nanda";
	}
	
	return mydata;
	
}
}
