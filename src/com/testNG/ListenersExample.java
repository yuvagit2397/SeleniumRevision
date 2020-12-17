package com.testNG;

import java.util.Scanner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersExample implements ITestListener {
	@Override
	@Test
	public void onFinish(ITestContext arg0) {
		System.out.println("After execution");
	}

	@Override
	@Test
	public void onStart(ITestContext arg0) {
		System.out.println("enter i");
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
	}

	@Override
	@Test
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	@Test
	public void onTestFailure(ITestResult arg0) {
		System.out.println("screenshot");
	}

	@Override
	@Test
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("skipped");
	}

	@Override
	@Test
	public void onTestStart(ITestResult arg0) {
		System.out.println("on test execution start");
	}

	@Override
	@Test
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("success");
	}
}
