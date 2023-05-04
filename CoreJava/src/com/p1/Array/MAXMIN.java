package com.p1.Array;

public class MAXMIN {
	public static void main(String[] abc) {
		int a[]= {2,5,3,1};
		int max=a[0];
		int min=a[1];
		for(int i=0;i<a.length;i++) {
		 if(a[i]>max) max=a[i];
			 
		 if(a[i]<min) min=a[i];	
		}	
		 System.out.println("minvalue="+min);
		 System.out.println("max value="+max);
		}
	}
	


