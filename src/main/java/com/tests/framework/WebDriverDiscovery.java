package com.tests.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverDiscovery {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {

			System.setProperty("webdriver.chrome.driver", PropLoader.getPropertyByName("webdriver.chrome.driver"));
            return driver = new ChromeDriver();
        } else return driver;
    }
}
