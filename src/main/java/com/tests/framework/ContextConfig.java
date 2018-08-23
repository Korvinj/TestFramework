package com.tests.framework;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tests")
public class ContextConfig {

    @Bean
    public WebDriver getDriver() { return WebDriverDiscovery.getDriver(); }
}
