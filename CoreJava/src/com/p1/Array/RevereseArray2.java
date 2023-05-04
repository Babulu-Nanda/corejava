package com.p1.Array;

import java.util.Arrays;
import java.util.Collections;

public class RevereseArray2 {
	public  static void main(String [] anc) {
		Integer[] arr= {1,2,3,4,5,6};
		int temp;
		int start=0;
		int end=5;
		/*1 type
		 * for (int i=arr.length-1;i>=0;i--) { System.out.println(arr[i]); }
		 */
		//2ndType
		Collections.reverse(Arrays.asList(arr)); 
        System.out.println("Reversed Array:" + Arrays.asList(arr)); 
        //3rd type
        while(start>end) {
        	temp=arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
        	
        }
        
        System.out.println("Reversed Array is :");
        for(int i=0;i<arr.length;i++)
        	
        System.out.println(arr[i]);
        
	}

}
