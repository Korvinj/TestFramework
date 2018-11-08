package com.tests.step_definition;

import com.tests.helpers.PersonalData;
import com.tests.page_objects.PersonalDataPage;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonalDataDefinition extends AbstractStepDefinitions {

	@Autowired
	PersonalDataPage personalDataPage;

	@When("I fill personal data for guest number: (\\d+)")
	public void fillPersonalDataByNumber(int number) {
		personalDataPage.scrollUntillElement(personalDataPage.getPersonalDataFieldByNumber("Name", number));
		PersonalData personalData = PersonalData.randomPersonalData();
		personalDataPage.getPersonalDataFieldByNumber("Name", number).sendKeys(personalData.getAge());
		personalDataPage.getPersonalDataFieldByNumber("Passport", number).sendKeys(personalData.getPassport());
		personalDataPage.getPersonalDataFieldByNumber("Age", number).sendKeys(personalData.getAge());
	}

	@When("I book a trip with all personal data")
	public void bookTrip() {
		personalDataPage.getConfirmBookingButton().click();
		personalDataPage.waitForPageLoaded();
	}
}
