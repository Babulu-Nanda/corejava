package com.p1.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateArray1 {
	public static void main(String[] abc) {
		int arr[] = {2,3,1,2,4};
		//Arrays.sort(arr);
		 int n = arr.length;
		 //duplicateArray(arr,n);
		 duplicateArraymethod2(arr);
		 ArrayList<Integer> all=duplicateArray3(arr,n);
		 System.out.println(all);
		 
	}

	private static  ArrayList<Integer> duplicateArray3(int[] arr, int n) {
		 ArrayList<Integer> al=new ArrayList<>();
	        for(Integer i=0;i<n;i++){
	            for(Integer j=i+1;j<n;j++){
	                if(arr[i]==arr[j]){
	                    al.add(arr[j]);
	                }
	              
	            }
	        } 
	       
	        if(al.size()<0)
			al.add(-1);
	        
	        return al;
	        
	        
			
	     
	}

	private static void duplicateArraymethod2(int[] arr) {
		//int [] arr= new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
      
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
	private static void duplicateArray(int[] arr, int n) {

        // Store elements and their counts in hash table
        Map<Integer, Integer> map
            = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            try {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            catch (Exception e) {
                map.put(arr[i], 1);
            }
        }
 
        // Since we want elements in the same order,we traverse array again and print those elements that appear more than once.
 
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
            }
        }
		
	}
	
	
	

}
