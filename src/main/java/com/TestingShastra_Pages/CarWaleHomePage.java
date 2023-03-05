package com.TestingShastra_Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.KeyWord;
import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.Testbase;
import com.TestingShastra_Pages.*;

public class CarWaleHomePage extends Testbase {
	
	public CarWaleHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class=' o-brXWGL']/div")
	List <WebElement> BuyingCarNotificationContains;
	
	@FindBy(xpath="(//span[contains (text(), 'Compare Now')])[1]")
	WebElement CompareCarsbuttons;
	
	//POM can be made without is pagefactory
	
	
	
	public void clickonCompareNowbutton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CompareCarsbuttons.click(); 
	}
	
	public WebElement popularBrandText() {
		return CompareCarsbuttons;
	}
	

	
}
