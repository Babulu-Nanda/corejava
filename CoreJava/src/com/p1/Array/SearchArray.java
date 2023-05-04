package com.p1.Array;

import java.util.Scanner;

public class SearchArray {
	public static void main(String[] svc) {
		int i,n,arr[],search;
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  amount of Element");
	n=sc.nextInt();
	arr=new int[n];
	System.out.println("Enter the Element");
	for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
	    System.out.println("Enter the Search Element=");
	    search=sc.nextInt();
	
	for(i=0;i<n;i++) {
		if(arr[i]==search)
			System.out.println(search + " is present at this index " + (i + 1) + ".");
		break;
			
	}
   if(i==n)
	System.out.println("Search Element is not Present");
	
		
	}
}
