package Com.DriverClassPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	public static ExtentReports getExtentReport() {
	String extentReportPth=System.getProperty("user.dir")+"\\reports\\extentreport.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPth);
	reporter.config().setReportName("Adactin Automation Result");
	reporter.config().setDocumentTitle("Adactin Automation Test Result");
	
	ExtentReports extentReport=new ExtentReports();
	extentReport.attachReporter(reporter);
	return extentReport;
}
}