package com.p1.Array;

public class NumberPattern1 {
	public static void main(String[] abc) {
		int n=3;
		int temp=n;
		int i,j;
		int res=n;
		while(temp!=0) {
			for(i=n;i>=1;i--)
				for(j=0;j<res;j++)
				
				System.out.print(i+" ");
		
			temp--;
			res--;
			System.out.printf("$");
		}
		
	}
	

}

