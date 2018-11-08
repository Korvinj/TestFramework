package com.tests.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDiscovery {
    private static WebDriver driver = null;
    private static String url = "";

    public static WebDriver getDriver() {
        if (driver == null) {
            String path = "C:\\wbd\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            return driver = new ChromeDriver();
        } else return driver;
    }
}
