package com.testNG;

import org.testng.annotations.Test;


public class TestNgBasics {
	int a=0;
	@Test(priority=1)
	public void add() {
		a=a+10;
		System.out.println(10/0);
	}

	@Test(dependsOnMethods="add",alwaysRun=true)  
	public void sub() {
		System.out.println("sub");
		System.out.println(10/a);
	}

	@Test(enabled=false)
	public void mul() {
		
		System.out.println("mul");
	}

	@Test(invocationCount=5)
	public void div() {
		System.out.println("div");
	}
}
