package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener{

	ExtentReports r;
	ExtentTest t;
	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		r.endTest(t);
		r.flush();
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		r=new ExtentReports("C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\MyFramework\\src\\test\\java\\com\\accenture\\tests\\Myreport.html");
		r.addSystemInfo("User","Shubham");
		r.addSystemInfo("Browser","Chrome");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed with success percentage");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Failed");
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"has failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//t=r.startTest(result.getMethod().getMethodName()+"has started");
		t=r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test success");
		//t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"has started");
	
	}

}
