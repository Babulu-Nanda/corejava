package com.p1;

@FunctionalInterface
public interface FunctionalInerfaceeee {
	void method2();

	default void log(String str) {
		System.out.println("Functional Interface1 logging::" + str);
		

	}
}
