package com.adactin.baseclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setPlatform(Platform.WINDOWS);
		//chrome.setCapability(CapabilityType.PLATFORM, "WIN8.1");
		URL url = new URL("http://192.168.43.116:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, chrome);
		driver.get("http://www.facebook.com");
	}

}