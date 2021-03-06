package com.tests.step_definition;

import com.tests.page_objects.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPageDefinitions extends AbstractStepDefinitions{

	@Autowired
	MainPage mainPage;

	@Given("^I open main page$")
	public void openMainPage() {
		mainPage.getPage();
		mainPage.waitForPageLoaded();
	}

	@When("^I login with login: ([^\"]*) and password: ([^\"]*)$")
	public void loginWithCredentials(String login, String password) {
		mainPage.getMyAccountButton().click();
		mainPage.getLoginButton().click();
		mainPage.waitForPageLoaded();
		mainPage.getEmailField().sendKeys(login);
		mainPage.getPasswordField().sendKeys(password);
		mainPage.getLoginToAccountButton().click();
		mainPage.waitForPageLoaded();
	}
}
