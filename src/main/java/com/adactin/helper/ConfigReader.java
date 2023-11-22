package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
public Properties ps;
	
	public ConfigReader() throws Throwable {
		
		try {
			File fs = new File(System.getProperty("user.dir")+"\\src\\test\\resource\\config.properties");
			FileInputStream fileInput = new FileInputStream(fs);
			ps = new Properties();
			ps.load(fileInput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
	public String getBrowser() {
		String browserName = ps.getProperty("BrowserName");
		if (browserName==null) {
			System.out.println("Browser Name is Not Found");
		}
		return browserName;
	}
	
	public String getUrl() {
		String urlName = ps.getProperty("Url");
		if (urlName==null) {
			System.out.println("Url is Not Found");
		}
		return urlName;
	}

}


