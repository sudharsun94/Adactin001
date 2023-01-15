package com.adactin.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;

import io.cucumber.java.*;


public class Hooks {
	
	private static WebDriver driver = Runner.driver;
			 
	@Before
	public void beforeHooks(Scenario scenario ) {
		String name = scenario.getName();
		System.out.println("Scenario name : "+name);

	}
	
	@After
	public void afterHooks(Scenario sce) throws IOException {
//		Status status = scenario.getStatus();
//		System.out.println("Scenario status : " + status);
		
		Status status = sce.getStatus();
		System.out.println("Scenario status : "+status);

		if (sce.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\sudha\\eclipse-workspace\\Adactin_Prct\\Screenshots"); 
			FileUtils.copyToDirectory(source, dest);
			
		}
	
}
	

}
