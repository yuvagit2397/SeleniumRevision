package com.testNG;

import org.testng.annotations.Test;

public class GroupsInTestNG {
	@Test(groups= "mi")
	public void mi() {
		System.out.println("mi");
	}

	@Test(groups= "mi")
	public void mi1() {
		System.out.println("mi1");
	}

	@Test(groups= "mi")
	public void mi2() {
		System.out.println("mi2");
	}

	@Test
	public void lava() {
		System.out.println("lava");
	}

	@Test
	public void apple() {
		System.out.println("apple");
	}

	@Test(groups= {"samsung"})
	public void samsung() {
		System.out.println("samsung");
	}

	@Test(groups= {"samsung"})
	public void samsung2() {
		System.out.println("samsung2");
	}
}
/*<suite name="yuvasri">
<test name="test">
	<groups>
		<run>
			<exclude name="samsung"/>
		</run>
	</groups>
	<classes>
		<class name="com.testNG.GroupsInTestNG"/>

	</classes>

</test>
</suite>*/