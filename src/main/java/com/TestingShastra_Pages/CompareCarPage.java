package com.TestingShastra_Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.KeyWord;
import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.Testbase;

public class CompareCarPage extends CarWaleHomePage {

	@FindBy(xpath="(//div[contains (text(), 'Select Car')])[1]")
	WebElement selectCarElement;
	
	@FindBy(xpath="(//div/h6[contains(text(),'POPULAR BRANDS')]/following-sibling::ul)[1]/li/div/div/span")
	//List<WebElement> PopularBrands;
	String PopularBrands;
	
	@FindBy(xpath="(//div/h6[contains(text(),'OTHER BRANDS')]/following-sibling::ul)[1]/li/div/div/span")
	String OtherBrands;
	
	public void clickonSelectCar() {
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectCarElement.click();
	}
	
	public List<String> getPopularBrandsText() {
		List<String> lstr=KeyWord.getTexts("xpath", PopularBrands);
		return lstr ;
	}
	
	public List<String> getOtherBrandBrandsText() {
		List<String> otstr=KeyWord.getTexts("xpath", OtherBrands);
		return otstr ;
	}
}
