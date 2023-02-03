package com.testingShastra_utils;

import java.io.FileInputStream;

public interface Carwale_Locator {
	String HomePage_POPULARBRANDS_List= "(//div/h6[contains (text(),'POPULAR BRANDS')]/following-sibling::ul)[1]/li/div/div/span";
	String HomePage_OTHERBRANDS_List= "(//div/h6[contains (text(),'OTHER BRANDS')]/following-sibling::ul)[1]/li/div/div/span";
	String url = "https://www.carwale.com/";
}
