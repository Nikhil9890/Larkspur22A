package com.TestingShastra.StepDefination;

import org.testng.Assert;
import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.KeyWord;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStep {

	@Given ("ब्राउज़र खुला")
	public void BrowserOpen() {
		KeyWord.openbrowser("Chrome");
	}
	
	@When ("User enter app url")
	public void urllaunch() {
		KeyWord.launchUrl("https://www.carwale.com");
	}
	
	@Then ("Application should launch")
	public void verifytitleofHomePage() {
		Assert.assertEquals(KeyWord.driver.getTitle(), "New Cars, Used Cars, Buy a Car, Sell Your Car - CarWale");
	}
	
//	@EitherOR ("com.TestingShastra_Pages")
//	public void verify() {
//
//	}
}
