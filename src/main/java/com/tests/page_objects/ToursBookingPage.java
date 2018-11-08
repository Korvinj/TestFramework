package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class ToursBookingPage extends AbstractPage {
	private static final String SEARCH_CITY_BUTTON = "//div[@id='s2id_autogen10']";
	private static final String SEARCH_CITY_FIELD = "//div[@id='select2-drop']//input[@class='select2-input']";
	private static final String AMOUNT_GUESTS_SELECT = "//select[@id='adults']";
	private static final String TOUR_TYPE_SELECT = "//select[@id='tourtype']";
	private static final String TOUR_TYPE_SELECT_BUTTON = "//div[@id='s2id_tourtype']";
	private static final String SEARCH_TOUR_BUTTON = "(//button[contains(text(),'Search')])[2]";

	public WebElement getSearchCityButton() {
		return waitUntilElementAppear(By.xpath(SEARCH_CITY_BUTTON));
	}

	public WebElement getSearchCityField() {
		return waitUntilElementAppear(By.xpath(SEARCH_CITY_FIELD));
	}

	public WebElement getAmountGuestsSelect() {
		return waitUntilElementAppear(By.xpath(AMOUNT_GUESTS_SELECT));
	}

	public WebElement getTourTypeSelectButton() {
		return waitUntilElementAppear(By.xpath(TOUR_TYPE_SELECT_BUTTON));
	}

	public WebElement getTourTypeSelect() {
		return waitUntilElementAppear(By.xpath(TOUR_TYPE_SELECT));
	}

	public WebElement getSearchTourButton() {
		return waitUntilElementAppear(By.xpath(SEARCH_TOUR_BUTTON));
	}

	public WebElement getSearchLinkByTypeAndCity(String tourType, String city) {
		return waitUntilElementAppear(By.xpath("//ul[@class='select2-results']//div[contains(text(),'" + tourType + "')]/..//span[text()='" + city + "']"));
	}
}
