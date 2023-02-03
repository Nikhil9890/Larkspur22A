package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor {
static WebDriverWait wait;
	
	static {
		wait=new WebDriverWait(KeyWord.driver, Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
	}
	
	public static void presenceofelement(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

}
