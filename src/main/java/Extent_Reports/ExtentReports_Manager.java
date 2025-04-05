package Extent_Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReports_Manager implements ITestListener {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest testextent;
	 
	  public void onStart(ITestContext context) {
		    sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");
			sparkReporter.config().setDocumentTitle("OrangeHRM Report"); // Title of report
			sparkReporter.config().setReportName("Selenium Testing"); // name of the report
			sparkReporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports(); // Create the Report
			extent.attachReporter(sparkReporter);//Creating the report with spark reporter design
			extent.setSystemInfo("Computer Name", "localhost");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Tester Name", "Kartik Sharma");
			extent.setSystemInfo("os", "Windows11");
			extent.setSystemInfo("Browser name", "Edge");
		  }
//	  public void onTestStart(ITestResult result) {
//		    // not implemented
//		  }
	  public void onTestSuccess(ITestResult result) {
		  testextent= extent.createTest(result.getName()); // create a new entry in the report
		  testextent.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
		  }
	  public void onTestFailure(ITestResult result) {
		  testextent = extent.createTest(result.getName()); // create a new entry in the report
		  testextent.log(Status.FAIL, "Test case FAILED is:" + result.getName()); // update status p/f/s
		  testextent.log(Status. FAIL, "Test Case FAILED cause is: " + result.getThrowable());
		  }
	  public void onTestSkipped(ITestResult result) {
		  testextent= extent.createTest(result.getName()); // create a new entry in the report
		  testextent.log(Status.SKIP, "Test case SKIPED is:" + result.getName()); // update status p/f/s
		  }

	  public void onFinish(ITestContext context) {
		  extent.flush();
		  }

}
