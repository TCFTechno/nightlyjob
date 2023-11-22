package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase104 {
	public WebDriver driver;
	
	public TestCase104(WebDriver mdriver) {
	this.driver=mdriver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	

	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="adult_room")
	private WebElement adultCounting;
	
	public WebElement getHotelnameverify() {
		return hotelnameverify;
	}

	@FindBy(id="hotel_name_0")
	private WebElement hotelnameverify;
	
	
	public WebElement getAdultCounting() {
		return adultCounting;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
