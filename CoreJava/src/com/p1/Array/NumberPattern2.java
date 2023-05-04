package com.p1.Array;

import java.util.ArrayList;

public class NumberPattern2 {
	public static void main(String[] abc) {
		int n=9;
		int i;
		ArrayList<Integer> al=new ArrayList<>();
		for(i=1;i<=10;i++)
			al.add(i*n);
		System.out.println(al.toString().replaceAll(",", ""));
	}


}
