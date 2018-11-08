package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends AbstractPage {
	private static final String MY_ACCOUNT = "(//li[@id='li_myaccount'])[2]";
	private static final String LOGIN_BUTTON = "(//a[text()=' Login'])[2]";
	private static final String EMAIL_FIELD = "username";
	private static final String PASSWORD_FIELD = "password";
	private static final String LOGIN_TO_ACCOUNT_BUTTON = "//button[text()='Login']";

	public WebElement getMyAccountButton() {
		return waitUntilElementAppear(By.xpath(MY_ACCOUNT));
	}

	public WebElement getLoginButton() {
		return waitUntilElementAppear(By.xpath(LOGIN_BUTTON));
	}

	public WebElement getEmailField() {
		return waitUntilElementAppear(By.name(EMAIL_FIELD));
	}

	public WebElement getPasswordField() {
		return waitUntilElementAppear(By.name(PASSWORD_FIELD));
	}

	public WebElement getLoginToAccountButton() {
		return waitUntilElementAppear(By.xpath(LOGIN_TO_ACCOUNT_BUTTON));
	}
}
