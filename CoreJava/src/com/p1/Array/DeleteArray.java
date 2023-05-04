package com.p1.Array;

public class DeleteArray {
	public static void main(String[] abc)
	{
		int[] arr= {12,22,32,40};
		int i,j,del;
		del=32;
		int size=arr.length;
		 del = 12;
	      
	      for(i=0; i<size; i++)
	      {
	         if(del==arr[i])
	         {
	            for(j=i; j<(size-1); j++)
	               arr[j] = arr[j+1];
	            System.out.println("\nRemoved the element successfully!");
	            break;
	         }
	      }
	      
	      System.out.println("\nThe new array is: ");
	      for(i=0; i<(size-1); i++)
	         System.out.print(arr[i]+ " ");
	   }
}
