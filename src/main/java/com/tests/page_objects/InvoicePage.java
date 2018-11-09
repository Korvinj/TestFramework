package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class InvoicePage extends AbstractPage {
	private static final String INVOICE_TABLE = "//table[@id='invoiceTable']";

	public WebElement getInvoiceTable() {
		return waitUntilElementAppear(By.xpath(INVOICE_TABLE));
	}
}
