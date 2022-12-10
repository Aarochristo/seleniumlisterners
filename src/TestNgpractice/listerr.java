package TestNgpractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listerr implements ITestListener
{
	
	
	
	
	
	

public void onStart(ITestContext context) {
	
	long beginwith=System.currentTimeMillis();
	
	System.out.println("started succesfully"+beginwith);
}


	public void onTestStart(ITestResult result) {
		System.out.println("test is implementing");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("if it is implement sucess take a snip");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("if it get failure show");
	}

	public void onFinish(ITestContext context) {
	
	
	long endtime=System.currentTimeMillis();
	System.out.println("if it get failure show"+endtime);
	}
	}
	

