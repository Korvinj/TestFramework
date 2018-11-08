package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class SearchToursResultPage extends AbstractPage {
	private static final String TRIP_DETAILS_BUTTON = "//button[text()='Details']";

	public WebElement getBookTourButtonByNumber(int number) {
		return waitUntilElementAppear(By.xpath("(" + TRIP_DETAILS_BUTTON + ")[" + number + "]"));
	}
}
