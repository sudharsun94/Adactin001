package com.adactin.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	
	private static WebDriver driver;
	
	
	
	//Page1
	@FindBy(name ="location") private WebElement location;
	@FindBy(name ="hotels") private WebElement hotels;
	@FindBy(name ="room_type") private WebElement roomtype;
	@FindBy(name ="room_nos") private WebElement numberfrooms;
	@FindBy(name ="datepick_in") private WebElement checkin;
	@FindBy(name ="datepick_out") private WebElement checkout;
	@FindBy(name="adult_room") private WebElement adults;
	@FindBy(name ="child_room") private WebElement children;
	@FindBy(name ="Submit") private WebElement search;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNumberfrooms() {
		return numberfrooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public Selection(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	

}
