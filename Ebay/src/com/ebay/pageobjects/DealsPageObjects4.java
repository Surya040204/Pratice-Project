package com.ebay.pageobjects;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class DealsPageObjects4 {

WebDriver driver = null;

//Storing the web elements by methods
By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_home = By.linkText("Home");

public DealsPageObjects4 (WebDriver driver) {
this.driver = driver;    }
public void clickDailyDealsButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_dailydeals).isDisplayed(), "\" dailydeals\" button is displayed");
	//Clicking on dailydeals button
driver.findElement (button_dailydeals).click(); 
}
public void clickHomeButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_home).isDisplayed(), "\" home\" button is displayed");
	//Clicking on home button
	driver.findElement (button_home).click();
  }
}
