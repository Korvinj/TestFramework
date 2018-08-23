package com.tests.step_definition;

import com.tests.page_objects.LoanPage;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class LoanPageDefinitions extends AbstractStepDefinitions{

    @Autowired
    LoanPage loanPage;

    @Then("^I check that all elements present on loan page$")
    public void checkThatElementsPresent() {
        loanPage.getProgressBar();
        loanPage.getButtonYes();
        loanPage.getButtonNo();
        loanPage.getButtonMale();
        loanPage.getButtonFemale();
        assertEquals("Not the same amount of fialds on the page", loanPage.getINPUTS().size(), 7);
        loanPage.getButtonSubmit();
    }
}
