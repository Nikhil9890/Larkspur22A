package com.testingShastra_hooks;

import com.TestingShastra.Larkspur22A_FrameWorkmainDemo.KeyWord;
import com.testingShastra_utils.Fileutils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@Before
	public void steup() {
		// TODO Auto-generated method stub
		String env=System.getProperty("env");
		System.out.println("environment"+env);
		KeyWord.openbrowser("chrome");
		KeyWord.launchUrl(Fileutils.getappurl(env));
	}
	
	@After
	public void teardown() {
		// TODO Auto-generated method stub
		KeyWord.driver.quit();
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("BeforeStep");
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("AfterStep");
	}
	
}
