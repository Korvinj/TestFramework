package com.tests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class WrongCredentialsPage extends AbstractPage {
    public static final String LOGIN_FORM = "//form[@id='loginform']";

    public WebElement getLoginForm() {
        return waitUntilElementAppear(By.xpath(LOGIN_FORM));
    }
}
