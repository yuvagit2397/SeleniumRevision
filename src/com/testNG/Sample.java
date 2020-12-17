package com.testNG;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public static void add() {
		System.out.println("hi");
	}
	@Test(enabled=false)
	public static void add1() {
		System.out.println(10);
		
	}
	
}
