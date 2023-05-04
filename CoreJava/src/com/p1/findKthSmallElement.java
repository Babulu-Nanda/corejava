package com.p1;

import java.util.Arrays;

public class findKthSmallElement {
public static void main(String []abc) {
	int [] arr= {7 ,10 ,4, 3 ,20 ,15};
	int n=6,k=5;
	int l=0;
	int kthsmallest=kthSmallest1(arr,l,n,k);
	System.out.println(kthsmallest);
}





private static int kthSmallest(int[] arr, int l, int n, int k) {
	Arrays.sort(arr);
    return(arr[k-1]);
}
  public static int kthSmallest1(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);//3,4,7,10,15,20
        int i=0;
        
        for(i=0;i<r && k!=1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                k--;
            }
        }
        
        return arr[i];
        
    } 
}
