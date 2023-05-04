package com.p1.Array;

public class ArrayInsideArray {
	public static void main(String[] ab) {
		int a1[] = {11, 1, 13, 21, 3, 7};
		int a2[] = {11, 3, 7, 1};
		int m=a1.length;
		int n=a2.length;
		String s=arraySubsetOfAnaotherArray(a1,a2,m,n);
		System.out.println(s);
	}

	private static String arraySubsetOfAnaotherArray(int[] a1, int[] a2, int m, int n) {
		String s="";
	    int i = 0;  
	    int j = 0;  
	    for (i = 0; i < n; i++) {  
	        for (j = 0; j < m; j++) {  
	            if (a2[i] == a1[j])  	
	                break;  
	        }  
	  
	        /* If the above inner loop was 
	        not broken at all then arr2[i] 
	        is not present in arr1[] */  
	        if (j == m)  
	            return "NotSubArray";  
	    }  
	   
	    return "Array is  SubArray";  
	
	}

}

