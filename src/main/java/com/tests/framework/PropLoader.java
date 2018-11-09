package com.tests.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropLoader {
	public static String getPropertyByName(String propertyName) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/configutation.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(propertyName);
	}
}
