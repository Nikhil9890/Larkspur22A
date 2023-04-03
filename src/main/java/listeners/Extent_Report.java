package listeners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Extent_Report {

	static ExtentTest Test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest(){
		report=new ExtentReports (System.getProperty("user.dir")+"\\ExtentReportResults.html");
		Test=report.startTest("Extent_Report");
	}
	
//	@org.testng.annotations.Test
//	public static void ExtentReportDemo() {
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");                not needed it is just written to check extent   
//		if(driver.getTitle().equalsIgnoreCase("google")) {      report program      
//			Test.log(LogStatus.PASS, "as specified url");
//		}else {
//			Test.log(LogStatus.FAIL, "TestFailed");
//		}
//	}
	
	@AfterClass
	public static void endtest(){
		report.endTest(Test);
		report.flush();
	}
}
