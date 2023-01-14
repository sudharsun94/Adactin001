package com.adactin.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_file {
	private static WebDriver driver;
	
	//Login_Page
	@FindBy(id = "username") private WebElement username;
	@FindBy (name = "password") private WebElement password;
	@FindBy (name = "login") private WebElement login;
	
	public WebElement getUsername() {
	return username;
}
    public WebElement getPassword() {
	return password;
}
    public WebElement getLogin() {
	return login;
}

	 

	//Page2
	@FindBy(id ="radiobutton_0") private WebElement radio;
	@FindBy(id ="continue") private WebElement continuenext;
	
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinuenext() {
		return continuenext;
	}
	
//////	//Page3
	@FindBy(name ="first_name") private WebElement firstname;
	@FindBy(name ="last_name") private WebElement lastname;
	@FindBy(name ="address") private WebElement Address;
	@FindBy(name ="cc_num") private WebElement creditcard;
	@FindBy(name ="cc_type") private WebElement credittype;
	@FindBy(name ="cc_exp_month") private WebElement month;
	@FindBy(name ="cc_exp_year") private WebElement year;
	@FindBy(name ="cc_cvv") private WebElement cvvnumbr;
	@FindBy(name ="book_now") private WebElement booknow;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCredittype() {
		return credittype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvvnumbr() {
		return cvvnumbr;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	//Logout
	@FindBy(xpath="(//input[@type='button'])[3]") private WebElement lgout;

	public WebElement getLgout() {
		return lgout;
	}


	//POM
	public Login_file(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	

	
	
	
}
