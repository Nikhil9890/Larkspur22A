package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testingShastra_utils.Fileutils;

public class Testbase extends KeyWord {
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = report.startTest("Testbase");
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	@BeforeMethod
	public static void launch_Browser(){
		String env=System.getProperty("env");
		System.out.println("environment"+env);
		KeyWord.openbrowser("chrome");
		KeyWord.launchUrl(Fileutils.getappurl(env));
	}
	
	@AfterMethod
	public static void closeBrowser() {
		KeyWord.driver.quit();
	}
	
//	//@BeforeMethod
//	public void logstatus() {
//		if() {
//			test.log(LogStatus.PASS, "Testcase is passed")
//		}else {
//			test.log(LogStatus.FAIL, "Test Failed");
//		}
//	}
	
}
