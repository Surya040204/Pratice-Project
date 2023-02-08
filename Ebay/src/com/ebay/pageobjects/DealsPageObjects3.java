package com.ebay.pageobjects;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class DealsPageObjects3 {

WebDriver driver = null;

//Storing the web elements by methods
By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_fashion = By.linkText("Fashion");

public DealsPageObjects3 (WebDriver driver) {
this.driver = driver;
}
public void clickDailyDealsButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_dailydeals).isDisplayed(), "\" dailydeals\" button is displayed");
	//Clicking on dailydeals button
driver.findElement (button_dailydeals).click(); 
}
public void clickFashionButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_fashion).isDisplayed(), "\" fashion\" button is displayed");
	//Clicking on fashion button
	driver.findElement (button_fashion).click();      }
}
