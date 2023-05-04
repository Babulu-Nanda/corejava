package com.p1;

public class Array3 {
	public static void main(String[] abc) {
		int[] array= {12,23,13,24,14};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("After Revese Order=");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

}
