package com.tests.step_definition;

import com.tests.page_objects.WrongCredentialsPage;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class WrongCredentialsPageDefinitions extends AbstractStepDefinitions {

    @Autowired
    WrongCredentialsPage wrongCredentialsPage;

    @Then("^I check that user on the wrong login page$")
    public void checkWrongLoggingPage() {
        wrongCredentialsPage.getLoginForm();
    }
}
