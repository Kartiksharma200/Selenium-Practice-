package TestNG_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Manager implements ITestListener{  //CLICK ITESTLISTENER FOR CLASS DO (CTRL + CLICK)
	
	public void onTestStart(ITestResult result) {	//BEFORE EACH TEST CASE START
		System.out.println("Test is started");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is started");
		  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
		  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skkiped");
		  }
	public void onStart(ITestContext context) { // BEFORE RUNNING ALL TEST CASES
		System.out.println("Test is Onstart");
		  }
	public void onFinish(ITestContext context) {  // AFTER RUNNING ALL TEST CASES
		System.out.println("Test is finished");
		  }
	
	

}
