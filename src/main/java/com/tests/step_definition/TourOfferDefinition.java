package com.tests.step_definition;

import com.tests.page_objects.TourOfferPage;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class TourOfferDefinition extends AbstractStepDefinitions {

	@Autowired
	TourOfferPage tourOfferPage;

	@When("I book a tour on the offer page")
	public void bookTourOfferPage() {
		tourOfferPage.scrollUntillElement(tourOfferPage.getBookTourNowButton());
		tourOfferPage.getBookTourNowButton().click();
		tourOfferPage.waitForPageLoaded();
	}
}
