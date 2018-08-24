package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends AbstractPage {
    private static final String LOAN_TYPE = "(//div[contains(@class, 'Select-value')])[1]/span";
    private static final String LOAN_AMOUNT = "(//div[contains(@class, 'Select-value')])[2]/span";
    private static final String LOAN_TIME = "(//div[contains(@class, 'Select-value')])[3]/span";
    private static final String GET_LOAN_BUTTON = "//button[text()='Jetzt Kreditvergleich starten']";
    private static final String LOGIN_BUTTON = "//span[text()='Anmelden']";
    private static final String LOGIN_EMAIL = "(//input[@name='email'])[3]";
    private static final String LOGIN_PASSWORD = "(//input[@name='password'])[2]";
    private static final String LOGIN_TO_ACCOUNT_BUTTON = "//button[text()='Anmelden ']";
    private static final String ONLY_LOGIN_ERROR_MESSAGE = "(//div[@class='Input__error-message']/span)[2]";
    private static final String LOGIN_ERROR_MESSAGE = "(//div[@class='Input__error-message']/span)[3]";
    private static final String PASSWORD_ERROR_MESSAGE = "(//div[@class='Input__error-message']/span)[4]";

    public WebElement getLoanType() {
        return waitUntilElementAppear(By.xpath(LOAN_TYPE));
    }

    public WebElement getLoanAmount() {
        return driver.findElement(By.xpath(LOAN_AMOUNT));
    }

    public WebElement getLoanTime() {
        return driver.findElement(By.xpath(LOAN_TIME));
    }

    public WebElement getLoanButton() {
        return driver.findElement(By.xpath(GET_LOAN_BUTTON));
    }

    public WebElement getLoginButton() {
        return waitUntilElementAppear(By.xpath(LOGIN_BUTTON));
    }

    public WebElement getLoginEmail() {
        return waitUntilElementAppear(By.xpath(LOGIN_EMAIL));
    }

    public WebElement getLoginPassword() {
        return driver.findElement(By.xpath(LOGIN_PASSWORD));
    }

    public WebElement getLoginToAccountButton() {
        return driver.findElement(By.xpath(LOGIN_TO_ACCOUNT_BUTTON));
    }

    public WebElement getLoginErrorMessage() {
        return driver.findElement(By.xpath(LOGIN_ERROR_MESSAGE));
    }

    public WebElement getPasswordErrorMessage() {
        return driver.findElement(By.xpath(PASSWORD_ERROR_MESSAGE));
    }

    public WebElement getOnlyLoginErrorMessage() {
        return driver.findElement(By.xpath(ONLY_LOGIN_ERROR_MESSAGE));
    }
}
