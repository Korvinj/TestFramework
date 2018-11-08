package com.tests.step_definition;


import com.tests.page_objects.PersonalProfilePage;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonalProfileDefinitions extends AbstractStepDefinitions {

	@Autowired
	PersonalProfilePage personalProfilePage;

	@When("I want to go to tour booking page")
	public void goToTourBookingPage() {
		personalProfilePage.getToursButton().click();
	}
}
