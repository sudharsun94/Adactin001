package com.adactin.singelton_design;

import org.openqa.selenium.WebDriver;

import com.adactin.login.Login_file;
import com.adactin.login.Selection;

public class Project_Obj_Mngr {
	
	private static WebDriver driver;
	 
	public Project_Obj_Mngr(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public Login_file getInstance() {
		Login_file lf = new Login_file(driver);
		 return lf; 

	}
	 
	public Selection getInstance1() {
		Selection sl = new Selection(driver);
		return sl;

	}
	

}
