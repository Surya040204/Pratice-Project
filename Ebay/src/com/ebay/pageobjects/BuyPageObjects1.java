package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class BuyPageObjects1 {
WebDriver driver = null;

//Storing the web elements by methods
By button_buy = By.linkText("Buy");
By button_electronics= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[2]/a");
By button_laptopsandnetbooks = By.xpath("//*[@id=\"electronics\"]/div/div[1]/div/ul/li[2]/a");

public BuyPageObjects1 (WebDriver driver) {
this.driver = driver;
}
public void clickBuyButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_buy).isDisplayed(), "\" Buy\" button is displayed");
	//Clicking on buy button
driver.findElement (button_buy).click(); 
}
public void clickElectronicsButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_electronics).isDisplayed(), "\" electronics\" button is displayed");
	//Clicking on electronics button
driver.findElement (button_electronics).click(); 
}
public void clickLaptopsAndNetbooksButton() {
	Assert.assertTrue(driver.findElement(button_laptopsandnetbooks).isDisplayed(), "\" laptopsandnetbooks\" button is displayed");
	//Clicking on laptops and net books button
driver.findElement (button_laptopsandnetbooks ).click(); 
}
 }