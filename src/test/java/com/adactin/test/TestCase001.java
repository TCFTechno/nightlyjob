package com.adactin.test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.adactin.baseclass.BaseClass;
import com.adactin.pom.LogIn2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase001 extends BaseClass {

	public WebDriver driver;

	LogIn2 l = new LogIn2(driver);


	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		l.getUserName().sendKeys("alps");
		
		l.getPassword().sendKeys("alps1234!");

	}

	

}
