package com.p1.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
	private static final boolean Integer = false;

	public static void main(String[] abc) {
		int a[] = { 1, 2, 3, 2,5 };
		int n=5;
		int element = findMajority(a,n);
		System.out.println(element);
	}

	private static int findMajority(int[] a,int size) {
		
	
	HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i< a.length; i++)
    {
        map.put(a[i], map.getOrDefault(a[i],0)+1);
        if(map.get(a[i]) > size/2)
        {
            return a[i];
        }
    }
   
    return -1;
}
	

	
}
