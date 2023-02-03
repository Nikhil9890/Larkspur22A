package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestingShastra_Pages.CarWaleHomePage;
import com.TestingShastra_Pages.CompareCarPage;

public class CareWaleTestcasesForPOM extends Testbase {

	@Test
	public void afterSelectCarOtherBrandcontainPopularbrand() {
		KeyWord.launchUrl("https://www.carwale.com/");
		KeyWord.scrollupPage();
		CarWaleHomePage homepage = new CarWaleHomePage(); // because constructor is made in CarWaleHomePage
		homepage.clickonCompareNowbutton();
		CompareCarPage comparecar = PageFactory.initElements(driver, CompareCarPage.class); // here constructor is not
																							// made in CompareCarPage
																							// class
		comparecar.clickonSelectCar();
		List<String> other=comparecar.getOtherBrandBrandsText();    //error
		List<String> popularbrands=comparecar.getOtherBrandBrandsText();
		Assert.assertTrue(popularbrands.containsAll(other));
	}

}
