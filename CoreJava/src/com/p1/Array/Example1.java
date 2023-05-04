package com.p1.Array;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] abc) {
		String ministatement = "19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D 19/11 AEPSABCDEF9323173568        100 D AVL Balance: Rs. 11395.71";

		String s = "19/11 AEPSABCDEF9323173568     322200 D ";
		System.out.println(s.length());
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(5,25));
		System.out.println(s.substring(26,37));
		System.out.println(s.substring(38,39));

		/*
		 * String availablebalance=ministatement.substring(ministatement.indexOf("AVL"),
		 * ministatement.length()); System.out.println(ministatement.length());
		 * System.out.println(availablebalance);
		 * 
		 * String ms=ministatement.replace(availablebalance, ""); List<String>
		 * mmm=getMsStrings(ms); System.out.println(mmm); }
		 * 
		 * public static List<String> getMsStrings(String ms) {
		 * System.out.println(ms.length());
		 * 
		 * List<String> msString = new ArrayList<>(); if (ms != null) { for (int i = 0;
		 * i < ms.length(); i += 40) { int li = 40+i; String ms1 = ms.substring(i, li);
		 * System.out.println(ms1); msString.add(ms1); } } return msString; }
		 */

	}
}
