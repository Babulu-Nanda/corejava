package com.p1;

public class MyClass implements FunctionalInerfaceeee,FunctionalInterface2 {

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void log(String str) {
		// TODO Auto-generated method stubFunctionalInerfaceeee.super.log(str);
		System.out.println("MyClass logging::"+str);
		FunctionalInterface2.print("abc");
	}
	
}
