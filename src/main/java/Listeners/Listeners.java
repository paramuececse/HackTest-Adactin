package Listeners;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Com.DriverClassPackage.AdactinDriverClass;
import Com.DriverClassPackage.ExtentReport;
public class Listeners extends AdactinDriverClass implements ITestListener {
WebDriver driver=null;
ExtentReports extentReport=ExtentReport.getExtentReport();
ExtentTest extentTest;
@Override
public void onTestStart(ITestResult result) {
	extentTest=extentReport.createTest(result.getName());
}
@Override
public void onTestSuccess(ITestResult result) {
	
	extentTest.log(Status.PASS, "Test Passed");
}
@Override
public void onTestFailure(ITestResult result) {
	extentTest.fail(result.getThrowable());
	String testName=result.getName();
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} 
	catch (IllegalAccessException|IllegalArgumentException|NoSuchFieldException|SecurityException e) {
		e.printStackTrace();
	}
	try {
		
		String screenshotpath= takeScreenshot(testName, driver);
		extentTest.addScreenCaptureFromPath(screenshotpath);
			} catch (IOException e) {
		e.printStackTrace();
	}
}
public void onFinish(ITestContext context) {
	
	extentReport.flush();
}
}

