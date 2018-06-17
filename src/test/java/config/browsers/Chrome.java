package config.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import readWritePropertyFile.ReadPropertyFile;

public class Chrome {
	private static WebDriver driver;
	private static ReadPropertyFile rpf = new ReadPropertyFile();

	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();

		getDriver().get(rpf.getBaseUrl());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		try {
			if (getDriver().findElement(By.xpath("//button[text()='Got it']")).isDisplayed()) {
				getDriver().findElement(By.xpath("//button[text()='Got it']")).click();
				Thread.sleep(2000);
			}
			if (getDriver().findElement(By.cssSelector("button.mol-ads-cmp--close")).isDisplayed()) {
				getDriver().findElement(By.cssSelector("button.mol-ads-cmp--close")).click();
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		getDriver().quit();
		driver.quit();
	}
}
