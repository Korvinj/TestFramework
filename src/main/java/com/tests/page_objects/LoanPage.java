package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoanPage extends AbstractPage {
    private static final String PROGRESS_BAR = "//div[@class='progress-bar']";
    private static final String BUTTON_YES = "//button[contains(text(), 'Ja, 2 Kreditnehmer')]";
    private static final String BUTTON_NO = "//button[contains(text(), 'Nein')]";
    private static final String BUTTON_MALE = "//button/*[contains(text(), 'Herr')]";
    private static final String BUTTON_FEMALE = "//button/*[contains(text(), 'Frau')]";
    private static final String INPUTS = "//input";
    private static final String BUTTON_SUBMIT = "//button/*[contains(text(), 'Weiter')]";

    public WebElement getProgressBar() {
        return driver.findElement(By.xpath(PROGRESS_BAR));
    }

    public WebElement getButtonYes() {
        return driver.findElement(By.xpath(BUTTON_YES));
    }

    public WebElement getButtonNo() {
        return driver.findElement(By.xpath(BUTTON_NO));
    }

    public WebElement getButtonMale() {
        return driver.findElement(By.xpath(BUTTON_MALE));
    }

    public WebElement getButtonFemale() {
        return driver.findElement(By.xpath(BUTTON_FEMALE));
    }

    public List<WebElement> getINPUTS() {
        return driver.findElements(By.xpath(INPUTS));
    }

    public WebElement getButtonSubmit() {
        return driver.findElement(By.xpath(BUTTON_SUBMIT));
    }
}
