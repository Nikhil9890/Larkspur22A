package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testingShastra_utils.Fileutils;
import com.testingShastra_utils.Carwale_Locator;


@Listeners(listeners.ListenerClass.class) 
public class HomepageTests extends Testbase{

	static String webaddress=com.testingShastra_utils.Fileutils.getappurl("stage");
	
	public static void commoncode(String[] args) throws InterruptedException {
		KeyWord.launchUrl(webaddress);
		KeyWord.windowmanage();
		Thread.sleep(5000);
		KeyWord.driver.switchTo().alert().dismiss();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(10000);
		WebElement Element = KeyWord.getWebElement("xpath","(//span[@class='o-cCFBmR' and contains(text(),'Compare Now')])[1]");
		Element.click();
		Thread.sleep(10000);
		WebElement k =KeyWord.getWebElement( "xpath","(//div[contains(text(),'Select Car')])[1]");
		k.click();
	}

	@Test
	public static void verifyCompareCarsShouldShowAllDetailsOfCar() throws InterruptedException {
		HomepageTests.commoncode(null);
		KeyWord.getWebElement("xpath","(//span[contains (text(),'Mahindra')])[1]").click();
	}

	@Test
	public static void afterSelectCarOtherBrandcontainPopularbrand() throws InterruptedException {
		HomepageTests.commoncode(null);
		List<WebElement> popularbrandlist = KeyWord.getWebElements(
				"(//div/h6[contains (text(),'POPULAR BRANDS')]/following-sibling::ul)[1]/li/div/div/span");
		List<WebElement> otherbrandlist = KeyWord.getWebElements(
				"(//div/h6[contains (text(),'OTHER BRANDS')]/following-sibling::ul)[1]/li/div/div/span");
		List<String> Popularstr = new ArrayList<String>();
		for (WebElement String : popularbrandlist) {
			Popularstr.add(String.getText());
		}
		List<String> otherstr = new ArrayList<String>();
		for (WebElement String : otherbrandlist) {
			otherstr.add(String.getText());
		}
		Assert.assertTrue(otherstr.containsAll(Popularstr));
	}
	

	@Test
	public static void afterSelectCarOtherBrandcontainPopularbrand1() throws InterruptedException {
		HomepageTests.commoncode(null);
		List<String> popularcars = KeyWord.getTexts("xpath",
				Fileutils.getLocator("HomePage_POPULARBRANDS_List"));
		List<String> othercars = KeyWord.getTexts("xpath",
				Carwale_Locator.HomePage_OTHERBRANDS_List);
		Assert.assertTrue(othercars.containsAll(popularcars));
	}
}
