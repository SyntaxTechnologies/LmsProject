package com.lms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	static Properties prop;

	public static Properties readProperties(String filepath) {
		
		try {
			FileInputStream fis = new FileInputStream(filepath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static String getPropertyValue(String key) {
		return prop.getProperty(key);
	}

}
