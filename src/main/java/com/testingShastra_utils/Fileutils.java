package com.testingShastra_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fileutils {

	// Write code to read properties file

	public static String getLocator(String Locator) {
		String basedir = System.getProperty("user.dir"); // used to returns the system property denoted by the specified
															// key passed as its argument as like user.dir or os.name or
															// java.runtime.version
		String LocatorValue = "";
		try {
			FileInputStream fis = new FileInputStream(basedir + "\\src\\main\\resources\\OR.properties");
			Properties prop = new Properties();
			prop.load(fis); // .load method loads a code file with specified name from local file system to
			// as dynamic library
			LocatorValue = prop.getProperty(Locator); // getProperty() method return string containing the value of
														// property
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return LocatorValue;
	}

	public static String getlocatorforijmeet(String Locator) {
		String basedir = System.getProperty("user.dir");
		String LocatorValue = "";
		try {
			FileInputStream fis = new FileInputStream(basedir + "\\src\\main\\resources\\ijmeetdata.properties");
			Properties prop = new Properties();
			prop.load(fis);
			LocatorValue = prop.getProperty(Locator);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LocatorValue;
	}
	
	public static String getappurl(String env) {
		String basedir = System.getProperty("user.dir");
		String urlvalue="";
		FileInputStream fis=null;
		Properties prop=null;
		try {
			fis= new FileInputStream(basedir+"/src/main/resources/Combine.properties");
			prop= new Properties();
			prop.load(fis);
			urlvalue = prop.getProperty("app"+env+"url");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(urlvalue);
		return urlvalue;
		
		// TODO Auto-generated method stub
	}

}
