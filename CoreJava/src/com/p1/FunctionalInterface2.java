package com.p1;

public interface FunctionalInterface2 {
void method1(String str);
	
	default void log(String str){
		System.out.println("functional2 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing "+str);
	}
}