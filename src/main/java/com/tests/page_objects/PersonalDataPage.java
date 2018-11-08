package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class PersonalDataPage extends AbstractPage {
	private static final String GUEST_NAME_FIELD = "//input[@placeholder='Name']";
	private static final String GUEST_PASSPORT_FIELD = "//input[@placeholder='Passport']";
	private static final String GUEST_AGE_FIELD = "//input[@placeholder='Age']";
	private static final String CONFIRM_BOOKING_BUTTON = "//button[text()='CONFIRM THIS BOOKING']";

	public WebElement getGuestNameField() {
		return waitUntilElementAppear(By.xpath(GUEST_NAME_FIELD));
	}

	public WebElement getGuestPassportField() {
		return waitUntilElementAppear(By.xpath(GUEST_PASSPORT_FIELD));
	}

	public WebElement getGuestAgeField() {
		return waitUntilElementAppear(By.xpath(GUEST_AGE_FIELD));
	}

	public WebElement getConfirmBookingButton() {
		return waitUntilElementAppear(By.xpath(CONFIRM_BOOKING_BUTTON));
	}

	public WebElement getPersonalDataFieldByNumber(String fieldName, int number) {
		return waitUntilElementAppear(By.xpath("(//input[@placeholder='" + fieldName + "])[" + number + "]"));
	}
}
