package com.tests.step_definition;

import com.tests.page_objects.ToursBookingPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;

public class ToursBookingDefinitions extends AbstractStepDefinitions {

	@Autowired
	ToursBookingPage toursBookingPage;

	@When("I search for tour type: ([^\"]*) to city: ([^\"]*)")
	public void searchForTourByTypeAndCity(String type, String city){
		toursBookingPage.getSearchCityButton().click();
		toursBookingPage.getSearchCityField().sendKeys(city);
		toursBookingPage.getSearchLinkByTypeAndCity(type, city).click();
	}

	@When("I want to book a tour for: ([^\"]*)")
	public void searchForTourByGuestsAmount(String amount) {
		new Select(toursBookingPage.getAmountGuestsSelect()).selectByVisibleText(amount);
	}

	@When("I want to book a tour with type: ([^\"]*)")
	public void searchForTourByType(String type) {
		toursBookingPage.getTourTypeSelectButton().click();
		new Select(toursBookingPage.getTourTypeSelect()).selectByVisibleText(type);
	}

	@When("I search for the tours")
	public void clickSearchButton() {
		toursBookingPage.getSearchTourButton().click();
		toursBookingPage.waitForPageLoaded();
	}
}
