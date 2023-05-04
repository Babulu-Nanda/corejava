package com.p1.Array;

import java.util.Arrays;

public class RotateCYclicslly {
	public static void main(String[] abc) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		 int x=arr[arr.length-1],i;
	
			
		        for(i=arr.length-1;i>0;i--)
		        arr[i]=arr[i-1];
		        arr[0]=x;
		        System.out.println("Reveresed Array=="+Arrays.toString(arr));
		}

	}

