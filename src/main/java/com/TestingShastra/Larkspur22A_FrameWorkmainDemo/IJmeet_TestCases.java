package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.io.File;

import org.checkerframework.common.util.report.qual.ReportUse;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.testingShastra_utils.Fileutils;
import com.testingShastra_utils.IjmeetLocator;
import com.testingShastra_utils.LocatorType;

import org.testng.annotations.*;
import listeners.ListenerClass;

@Listeners(listeners.ListenerClass.class) 
@ReportUse
public class IJmeet_TestCases extends Testbase {
	@Test
	public void SignINpage() {
		String Expectedsigninpagetitle = "IJmeet";
		KeyWord.launchUrl(Fileutils.getlocatorforijmeet("url"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.HomePageSignIn).click();
		String Actualsigninpagetitle = driver.getTitle();
		Assert.assertEquals(Actualsigninpagetitle, Expectedsigninpagetitle);
	}

	@Test
	public void enterlogindetailsandsignin() {
		KeyWord.launchUrl(Fileutils.getlocatorforijmeet("url"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.HomePageSignIn).click();
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.EmailInput,
				Fileutils.getlocatorforijmeet("EmailId"));
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.PasswordInput,
				Fileutils.getlocatorforijmeet("Password"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.SignInPageButton).click();
	}

	@Test(dataProvider = "login-data", dataProviderClass = UserDataProvider.class)
	public void enterlogindetailsandsigninbyexceldata(String username, String password) {
		KeyWord.launchUrl(Fileutils.getlocatorforijmeet("url"));
		System.out.println(username + "/" + password);
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.HomePageSignIn).click();
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.EmailInput, username); // this is excel read data
																							// name "company"
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.PasswordInput, password);
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.SignInPageButton).click();
	}

	@Test
	public void scheduledmeeting() {
		KeyWord.launchUrl(Fileutils.getlocatorforijmeet("url"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.HomePageSignIn).click();
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.EmailInput,
				Fileutils.getlocatorforijmeet("EmailId"));
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.PasswordInput,
				Fileutils.getlocatorforijmeet("Password"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.SignInPageButton).click();
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.ScheduledMeeting).click();
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.MeetingTopic, "IndianEconomy");
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.MeetingDecription, "Last10YearsDescription");
	}

	@Test
	public void quickmeeting() throws InterruptedException {
		KeyWord.launchUrl(Fileutils.getlocatorforijmeet("url"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.HomePageSignIn).click();
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.EmailInput,
				Fileutils.getlocatorforijmeet("EmailId"));
		KeyWord.entertextbysendkeys(LocatorType.xpath, IjmeetLocator.PasswordInput,
				Fileutils.getlocatorforijmeet("Password"));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.SignInPageButton).click();
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.QuickMeeting).click();
		KeyWord.presenceofelement(By.xpath(IjmeetLocator.Close));
		//Waitfor.presenceofelement(By.xpath(IjmeetLocator.Close));
		KeyWord.getWebElement(LocatorType.xpath, IjmeetLocator.Close).click();
	}
}
