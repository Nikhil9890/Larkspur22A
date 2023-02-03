package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class KeyWord {
	public static WebDriver driver;
	static WebDriverWait wait;

	public static void presenceofelement(By element) {
		wait = new WebDriverWait(KeyWord.driver, Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public static String textconvert(WebElement element) {
		return element.getText();
	}

	public static String getText(String LocatorType, String LocatorValue) {
		return getWebElement(LocatorType, LocatorValue).getText();
	}

	public static XSSFSheet Inputdata(int sheetnumber, String filepath) throws Exception {
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetnumber);
		return sheet;
	}

	public static List<String> getTexts(String LocatorType, String LocatorValue) {
		List<WebElement> element = new ArrayList<WebElement>();
		List<String> text = new ArrayList<String>();
		if (LocatorType.equalsIgnoreCase("ID")) {
			element = driver.findElements(By.id(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElements(By.xpath(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("cssSelector")) {
			element = driver.findElements(By.cssSelector(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("linkText")) {
			element = driver.findElements(By.linkText(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("name")) {
			element = driver.findElements(By.name(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase("partialLinkText")) {
			element = driver.findElements(By.partialLinkText(LocatorValue));
		}
		for (WebElement str : element) {
			text.add(str.getText());
		}
		return text;
	}

	public static void entertextbysendkeys(String LocatorType, String LocatorValue, String EnterText) {
		getWebElement(LocatorType, LocatorValue).sendKeys(EnterText);
	}

	public static WebElement getWebElement(String LocatorType, String LocatorValue) {
		if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.id)) {
			return driver.findElement(By.id(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.xpath)) {
			return driver.findElement(By.xpath(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.css)) {
			return driver.findElement(By.cssSelector(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.linkText)) {
			return driver.findElement(By.linkText(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.tagName)) {
			return driver.findElement(By.tagName(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.partialLinkText)) {
			return driver.findElement(By.partialLinkText(LocatorValue));
		} else if (LocatorType.equalsIgnoreCase(com.testingShastra_utils.LocatorType.name)) {
			return driver.findElement(By.name(LocatorValue));
		} else

			return null;
	}

	public static void takepngscreenshot_savedat(String location) {
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(s.getImage(), "PNG", new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Parameters("browser-name")
	public static void openbrowser(String browsername) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Invalid Browser");
		}
	}

	public static void launchUrl(String webaddress) {
		driver.get(webaddress);
	}

	public static void windowmanage() {
		driver.manage().window().maximize();
	}

	public static void explicitwait(String LocatorType, String LocatorValue) {
		WebElement xpath = KeyWord.getWebElement(LocatorType, LocatorValue);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
	}

//	public static WebElement getWebElement(String Pathaddress) {
//		return driver.findElement(By.xpath(Pathaddress));
//	}

	public static List<WebElement> getWebElements(String Pathaddress) {
		return (List<WebElement>) driver.findElement(By.xpath(Pathaddress));
	}

	public static void scrollupPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
