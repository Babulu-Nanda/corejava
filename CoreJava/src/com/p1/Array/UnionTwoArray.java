package com.p1.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class UnionTwoArray {
	public static void main(String[] abc) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		Integer[] b = { 2, 3, 7 };
		int m = a.length;
		int n = b.length;
		
		union1(a,b);
		
		/*ArrayList<Integer> uni = Unionarray(a, b, n, m);
		for (int i : uni) {
			System.out.print(i + " ");
		}*/
		
		
	}

	private static void union1(Integer[] a, Integer[] b) {
		
		   
		      //Initialize Hashset to perform union operation
		      HashSet<Integer> set = new HashSet<>();
		      
		      //add first array to set
		      set.addAll(Arrays.asList(a));
		      
		      //add second array to set
		      set.addAll(Arrays.asList(b));
		      
		      //convert to array from set
		      Integer[] union = {};
		      union = set.toArray(union);
		      
		      //print the result
		      System.out.println("Union of two arrays is: " + Arrays.toString(union));
		   }
		
		
	}

/*	private static ArrayList<Integer> Unionarray(Integer[] a, Integer[] b, int n, int m) {

		TreeSet<Integer> set = new TreeSet<>();

		// Remove the duplicates from arr1[]
		for (int i : a)
			set.add(i);

		// Remove duplicates from arr2[]
		for (int i : b)
			set.add(i);

		// Loading set to array list
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : set)
			list.add(i);

		return list;
	}*/
	
