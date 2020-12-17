package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {
@Test
public void hardAssert() {
String name="paanai";
Assert.assertEquals(name, "pnai");
System.out.println("Ha");

}
@Test
public void softAssert() {
	String name="paanai";
	SoftAssert s=new SoftAssert();
	s.assertEquals(name,"yuvasri");
	System.out.println("verify");
	
}

}
