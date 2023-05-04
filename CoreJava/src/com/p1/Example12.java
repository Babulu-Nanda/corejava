package com.p1;

import java.util.Base64;

public class Example12 {


	public class Example
	{
	   public static void Main()
	   {
	       // Define a byte array.
	       byte[] bytes = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
	       
	       // Convert the array to a base 64 string.
	       String s = 
	       Base64.getEncoder().encodeToString(bytes);
	      System.out.println(s);
	       // Restore the byte array.
	      // byte[] newBytes = Convert.FromBase64String(s);
	      
	   }
	}

}
