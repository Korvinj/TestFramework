package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class PersonalProfilePage extends AbstractPage {
	private static final String TOURS_BUTTON = "//li[@data-title='tours']";

	public WebElement getToursButton() {
		return waitUntilElementAppear(By.xpath(TOURS_BUTTON));
	}
}
