package com.tests.step_definition;

import com.tests.page_objects.SearchToursResultPage;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchToursResultDefinition extends AbstractStepDefinitions {

	@Autowired
	SearchToursResultPage searchToursResultPage;

	@When("I select (\\d+)(?:st|nd|rd|th) tour from search")
	public void selectTourFromSearchByNumber(int number) {
		searchToursResultPage.getBookTourButtonByNumber(number).click();
		searchToursResultPage.waitForPageLoaded();
	}

}
