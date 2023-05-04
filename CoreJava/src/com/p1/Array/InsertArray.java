package com.p1.Array;

import java.util.Scanner;

public class InsertArray {
	public static void main(String [] avc)
	{
	/*	int n,i, arr[],ele,pos;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the  element");
	    n=sc.nextInt();
	    arr=new int[n];
		System.out.println("Enter the Array Element");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
	
		System.out.println("Enter the add Element");
				ele=sc.nextInt();
				System.out.println("Enter the positionwhere we adding the Array");
				pos=sc.nextInt();
	    for(i=n-1;i>pos-1;i--)
		    arr[i]=arr[i-1];  		
	    arr[pos-1]=ele;
	    System.out.println("After inserting the array element is =");
	    for(i=0;i>n;i++) {
	    	System.out.println(arr
	    			[i]);
	    }
	    */
		int[] arr= {12,12,13,14,15};
		int i,ins=11,pos=1;
		for(i=arr.length-1;i>pos-1;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[pos-1]=ins;
		System.out.println("After inserting the array element is =");
	    for(i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]);
	}
	
	
	    
	    
	    
	}
}
