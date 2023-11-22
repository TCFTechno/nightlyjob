package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement logIn;
	
	@FindBy(id="username_show")
	private WebElement accountName;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	public WebElement getAccountName() {
		return accountName;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	public LogIn(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

}
