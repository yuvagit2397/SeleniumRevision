package com.testNG;

import org.testng.annotations.Test;

public class Practice {
	int a=10;
	int b=2;
	int c;
	@Test(groups="math")
	public void add() {
		c=a+b;
		System.out.println(c);
		}
	@Test(groups="math",priority=1,dependsOnGroups="math1")
	private void sub() {
		c=a-b;
		System.out.println(c);

	}
	@Test(groups="math1",invocationCount=3)
	private void mul() {
		c=a*b;
		System.out.println(c);

	}
	@Test(groups="math1")
	private void div() {
		c=a/b;
		System.out.println(c);
	}
}
