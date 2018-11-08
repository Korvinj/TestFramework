package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPage {

    @Autowired
    protected WebDriver driver;

    public void getPage() {
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
    }

    public WebElement waitUntilElementAppear(By selector) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
}
