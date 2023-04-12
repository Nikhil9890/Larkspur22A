package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		FluentWait waitFor= new FluentWait(driver);
		waitFor.withTimeout(Duration.ofSeconds(10));
		waitFor.pollingEvery(Duration.ofSeconds(1));
		waitFor.ignoring(NoSuchElementException.class);
	}
}
