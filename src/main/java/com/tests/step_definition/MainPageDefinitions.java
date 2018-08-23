package com.tests.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import com.tests.page_objects.MainPage;

import static org.junit.Assert.assertEquals;

public class MainPageDefinitions extends AbstractStepDefinitions {

    @Autowired
    MainPage mainPage;

    @Given("^Open smava page$")
    public void openBrowserPage() {
        mainPage.getPage();
    }

    @When("^Select loan type ([^\"]*)$")
    public void selectLoanType(String loanType) {
        mainPage.getLoanType().click();
        mainPage.getSelectByText(loanType).click();
    }

    @When("^Select loan amount ([^\"]*) €$")
    public void selectLoanAmount(String amount) {
        mainPage.getLoanAmount().click();
        mainPage.getSelectByText(amount).click();
    }

    @When("^Select loan time ([^\"]*)$")
    public void selectLoanTime(String time) {
        mainPage.getLoanTime().click();
        mainPage.getSelectByText(time).click();
    }

    @When("Press get loan button")
    public void pressSearch() {
        mainPage.getLoanButton().click();
    }

    @When("Try to login to account with username: ([^\"]*) and password: ([^\"]*)")
    public void pressLoginButton(String usermane, String password) {
        mainPage.getLoginButton().click();
        mainPage.getLoginEmail().sendKeys(usermane);
        mainPage.getLoginPassword().sendKeys(password);
        mainPage.getLoginToAccountButton().click();
    }

    @Then("I check that error message on the page: ([^\"]*)")
    public void checkErrorMessageOnPage(String errorText) {
        assertEquals("Expected and actual error mesages not the same", errorText, mainPage.getLoginErrorMessage().getText());
    }


    @When("wait")
    public void waitSearch() throws InterruptedException {
        Thread.sleep(5000);
    }
}
