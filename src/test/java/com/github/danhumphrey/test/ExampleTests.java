package com.github.danhumphrey.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


class ExampleTests extends BaseTestSuite {

	@Test
	void testHomePageHeading() {
		WebDriver driver = getDriver();
		WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("danhumphrey/junit-selenium-parallel-starter", h1Element.getText());
	}

	@Test
	void testCareersPageHeading() {
		WebDriver driver = getDriver();
		WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("danhumphrey/junit-selenium-parallel-starter", h1Element.getText());
	}
	
	@Test
	void testAboutPageHeading() {
		WebDriver driver = getDriver();
		WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("danhumphrey/junit-selenium-parallel-starter", h1Element.getText());
	}
	
	@Test
	void testFailingHomePageHeading() {
		WebDriver driver = getDriver();
		WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("danhumphrey/junit-selenium-parallel-starter", h1Element.getText());
	}
}
