package com.p1.Array;

public class ArrayLargestSum {
	public static void main(String[] abc) {
		
		        int[] a = { 1,2,3,-2,5 };
		        System.out.println("Maximum contiguous sum is "
		                           + maxSubArraySum(a));
	}
	 private static long maxSubArraySum(int[] a) {
		 int maxsum= Integer.MIN_VALUE,
		            currsum = 0, start = 0, end = 0, s = 0;
		 
		        for (int i = 0; i < a.length; i++) {
		            currsum += a[i];
		 
		            if (maxsum < currsum) {
		                maxsum = currsum;
		             
		            }
		 
		            if (currsum < 0) {
		                currsum = 0;
		                s = i + 1;
		            }
		        }
		        System.out.println("Maximum contiguous sum is "
		                           + maxsum);
		       
	return Long.valueOf(maxsum);	    
	 }
	 
		 
	}
	
	 
	

	/*private static Integer maxSubArraySum(int[] a) {
		int size = a.length;
        int maxsum = 0, cursum= 0;
 
        for (int i = 0; i < size; i++) {
        	cursum=cursum+a[i];
        	
            
            if (cursum > maxsum)
                maxsum = cursum;
            if (cursum < 0)
                cursum = 0;
        }
        return maxsum;
	}*/
	
	
	

