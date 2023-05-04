package com.p1.Array;


//Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

public class InvertionOfArray {
public static void main(String[] zcs) {
	 long N = 5, arr[] = {2, 4, 1, 3, 5};
	long s=inversionCount(arr, N);
}

	
	  static long inversionCount(long arr[], long N)
	    {
	     long inv_count = 0;
	        for (int i = 0; i < N - 1; i++)
	            for (int j = i + 1; j < N; j++)
           if (arr[i] > arr[j])
	                    inv_count++;
	  
	        return inv_count;
	    }
}
