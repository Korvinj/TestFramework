package com.tests.step_definition;

import com.tests.page_objects.InvoicePage;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class InvoiceDefinition extends AbstractStepDefinitions {

	@Autowired
	InvoicePage invoicePage;

	@Then("I check that i got invoice after registration")
	public void checkThatInvoicePresent() {
		assertTrue("Invoice not showed after timeout", invoicePage.getInvoiceTable().isDisplayed());
	}
}
