 
package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports getReport() {
		
		String path="./reports/Extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("CURA Healthcare Report");
		reporter.config().setDocumentTitle("CURA Healthcare service_Functional report");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("HostName","Localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("OS","Window10");
		extent.setSystemInfo("Tester Name","Venkatesh");
		 
		
		return extent;
		
		
	}
	
}