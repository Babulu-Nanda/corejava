package com.p1.Array;

public class LargestSubArrayWithZero {
	public static void main(String [] abc) {
		int[] a= {15,-2,2,-8,1,7,10,23};
		int aaaa=largestSubArrayWithZero(a);
		System.out.println(aaaa);
	}

	private static int largestSubArrayWithZero(int[] a) {
		 
		        int maxlength= 0;
		 
		        
		        for (int i = 0; i < a.length-1; i++) {
		          
		            int curr_sum = 0;
		 
		            for (int j = i; j < a.length-1; j++) {
		                curr_sum += a[j];
		 
		            
		                if (curr_sum == 0)
		                    maxlength = Math.max(maxlength, j - i + 1);
		            }
		        }
		        return maxlength;
		    }
		 

	

}
