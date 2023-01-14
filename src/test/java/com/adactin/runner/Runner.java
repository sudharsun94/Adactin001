package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.config.Config_Reader;
import com.adactin.config.File_Reader_Managr;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition",
tags = "@hi or @hello", plugin = {"pretty","html:target/report/html"} , monochrome = true , dryRun = false)
 
 public class Runner {
	
  public static	WebDriver driver;
	
    @BeforeClass
	public static void setup() throws Throwable {
	  
      //   String brw = File_Reader_Managr.getDataFR().getDataCR().Browser();
		 driver= Base_Class.driverLaunch();
		

	}
	
	
	

}
