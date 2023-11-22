package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn2 {

	public WebDriver driver;

	@FindBy(id = "login")
	private WebElement loginbtn;

	@FindBy(id = "userName")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public LogIn2(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

}
