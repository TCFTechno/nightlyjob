package com.adactin.stepdef;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReadManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;

	@Before
	public static void setUp() throws Throwable {
		try {
			String browser = FileReadManager.getInstance().getCr().getBrowser();
			driver = BaseClass.getBrowser(browser);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Browser Name is Invalid");
		}
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}
	}

	@After
	public static void driverQuit() {
		driver.quit();
		
		System.out.println("driver quit ");
	}
}