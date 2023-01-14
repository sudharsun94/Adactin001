package com.adactin.config;

public class File_Reader_Managr {
	
	private File_Reader_Managr() {
		
	}

	
	//[OBJECT CREATION]
	public static  File_Reader_Managr getDataFR() {
		File_Reader_Managr helper = new File_Reader_Managr();
		return helper;

	}
	
	
	public static  Config_Reader getDataCR() throws Throwable {
		Config_Reader reader = new Config_Reader(); //(Its Both the Constructor & Class)
		return reader;
	}
	 
	
}
