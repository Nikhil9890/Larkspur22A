package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingShastra_utils.Fileutils;

public class Amazon_Testcases extends Testbase {
	
	@Test
	public static void Homepage() {
		  //Fileutils method change with respect to properties file
		KeyWord.launchUrl(Fileutils.getLocatorforany("stage"));
		String title=driver.getTitle();
		Assert.assertEquals(title, Fileutils.getLocator("ExpectedTitle"));
	}
}
