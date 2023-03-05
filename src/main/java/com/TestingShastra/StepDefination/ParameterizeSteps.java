package com.TestingShastra.StepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizeSteps {

	int x,y,result=0;
	@Given("first step")
	public void thisisfirststep() {
		System.out.println("Before each scenario");
	}
	
	 @Given ("I have 5 and 6")
	public void ihavenumbers() {
		System.out.println("Addition of two numbers");
		this.x=x;
		this.y=y;
	}
	
	 @When ("I add them") 
	public void addthem(int x,int y) {
		 result=x+y;
	}
	
	@Then ("Addition must be even")
	public void additionisevenornot() {
		Assert.assertTrue(result%2==0);;
	}
}
