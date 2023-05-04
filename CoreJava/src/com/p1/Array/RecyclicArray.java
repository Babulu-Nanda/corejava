package com.p1.Array;

import java.util.Arrays;

public class RecyclicArray {
	public static void main(String[] abc) {
		int[] a= {1,2,3,4,5};
		int i,x=a[a.length-1];
		System.out.println(x);
		for(i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			
			
		}
		a[0]=x;
		System.out.println("Reveresed Array=="+Arrays.toString(a));
	}

}
