package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class TourOfferPage extends AbstractPage {
	private static final String BOOK_TOUR_NOW_BUTTON = "//button[text()='Book Now']";

	public WebElement getBookTourNowButton() {
		return waitUntilElementAppear(By.xpath(BOOK_TOUR_NOW_BUTTON));
	}
}
