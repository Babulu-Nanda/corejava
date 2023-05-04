package com.p1.BinarySearch;

public class binarySearch1 {

	 public static int  binarySearch(int arr[], int target){ 
		 int start=0;
		 int end=arr.length-1;  
		   
		   while( start <= end ){  
			   int mid = start + (end-start)/2;  
		      if ( target<arr[mid]  ){  
		         end = mid - 1;     
		      }
		      else if(target>arr[mid]){
		    	  start=mid+1;
		      } 
		      else 
		    	  return mid;
		    
		   } 
		   return -1;
		    
		    
		 }  
		 public static void main(String args[]){  
		        int arr[] = {10,20,30,40,50,75,80};  
		        int target = 30;  
		        
		       int n= binarySearch(arr,target); 
		       System.out.println(n);
		 }  
		}  