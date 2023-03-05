package com.TestingShastra.StepDefination;

import java.util.List;

import org.testng.Assert;

import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.KeyWord;
import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.Waitfor;
import com.TestingShastra_Pages.CarWaleHomePage;
import com.TestingShastra_Pages.CompareCarPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	@Given("user click on comparenow button")
	public void clickoncomparenowbutton() {
		KeyWord.scrollupPage();
		CarWaleHomePage carewale = new CarWaleHomePage();
		carewale.clickonCompareNowbutton();
	}

	@When("User click on select car icon")
	public void clickonselectcaricon() throws InterruptedException {
		CompareCarPage comparecar = new CompareCarPage();
		comparecar.clickonSelectCar();
	}

	@Then("Check your all product under popular brands present in other brands")
	public void getpopularcarlist() throws InterruptedException {
		CompareCarPage CompareCar = new CompareCarPage();
		List<String> otherbrands = CompareCar.getOtherBrandBrandsText();
		List<String> popularbrands = CompareCar.getPopularBrandsText();
		Assert.assertTrue(otherbrands.containsAll(popularbrands));
	}

}
