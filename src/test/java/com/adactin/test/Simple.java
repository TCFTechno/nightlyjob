package com.adactin.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {

	public WebDriver driver;

	@BeforeTest
	void LaunchBrowser() {

		if (driver == null) {
			try {
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();

				driver.get("https://statisticstimes.com/demographics/india/indian-states-population.php");
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException();
			}

		} else {

			System.out.println("driver not assigned");
		}
	}

	@Test
	void Login() throws IOException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

		List<WebElement> findElements = driver.findElements(By.xpath("//th[text()='Country']//following::tr/td[8]"));

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			
			
			if(map.containsKey(text))
			{
				Integer integer = map.get(text);
				map.put(text, integer+1);
			}else {
				map.put(text, 1);
			}

		}
		System.out.println(map);
		
	

	}

	@AfterTest
	void CloseBrowser() {

		driver.close();
	}

}
