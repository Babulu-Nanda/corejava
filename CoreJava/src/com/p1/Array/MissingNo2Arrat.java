package com.p1.Array;

public class MissingNo2Arrat {
	public static void amin(String[] abc) {
		int arr[]= {1,2,3,4,6};
		int n=arr.length+1;
		int totalSum=n*n+1/2;
		int sum=0;
		for(int i=0;i<n;i++) 
			sum=sum+arr[i];
		System.out.println("Missing No:"+(totalSum-sum));
		}
	
	
		
	}


