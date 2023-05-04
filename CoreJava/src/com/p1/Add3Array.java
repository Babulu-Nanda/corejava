package com.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add3Array {
	public static void main(String[] abc) {
		
	
		int[] nums = new int[] {2,8,4,5,7};
		
		int target = 17;
		
		List<Integer[]>  result=sum3Array(nums,target);
		for(Integer[] l: result) {
			for(int n:l) {
				System.out.print(n+" ");
			}
			System.out.println();
			
		}
	}

	private static List<Integer[]>  sum3Array(int[] nums, int target) {
		List<Integer[]>  res=new  ArrayList<>();
		for(int i=0;i<=nums.length;i++) {
			for(int j=i+1;j<=nums.length;j++) {
				for(int k=j+1;k<=nums.length;k++) {
				  if(target==nums[i]+nums[j]+nums[k]){
					  res.add(new Integer[] { nums[i], nums[j], nums[k] });
				  }	
				}
				
			}
		}
		return res;
	}

}
