package com.adactin.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Config_Reader {
	
	private static Properties pro;
	
	public Config_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\sudha\\eclipse-workspace\\Adactin_Prct\\src\\test\\java\\com\\adactin\\config\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
	  pro = new Properties();
	  pro.load(fis);

	}

	public String Browser() {
		String brw = pro.getProperty("browser");
		return brw;
		
 
	}
	
	public String Url() {
		String url = pro.getProperty("url");
		return url;

	}
	
	public String Uname() {
		String uname = pro.getProperty("uname");
		return uname;

	}
	
   public String Psswrd() {
	String psswd = pro.getProperty("psswd");
	return psswd;

}
	

	
	 
	
	
	
	
	
	
	
	
	
	
	

}
