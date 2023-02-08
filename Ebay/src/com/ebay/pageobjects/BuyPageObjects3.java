package com.ebay.pageobjects;

import org.openqa.selenium.By; 


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class BuyPageObjects3 {

WebDriver driver = null;

//Storing the web elements by methods
By button_buy = By.linkText("Buy");
By button_sportinggoods= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[5]/a");
By button_sportstradingcardsandaccessories = By.xpath("//*[@id=\"sporting-goods\"]/div/div[1]/div/ul/li[1]/a");


public BuyPageObjects3 (WebDriver driver) {

this.driver = driver;

}

public void clickBuyButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_buy).isDisplayed(), "\" buy\" button is displayed");
	//Clicking on buy button
driver.findElement (button_buy).click(); 
}
public void clickSportingGoodsButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_sportinggoods).isDisplayed(), "\" sportinggoods\" button is displayed");
	//Clicking on sportinggoods button
driver.findElement (button_sportinggoods).click(); 
}
public void clickSportsTradingCardsAndAccessoriesButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_sportstradingcardsandaccessories).isDisplayed(), "\" sportstradingcardsandaccessories\" button is displayed");
	//Clicking on sportstradingcardsandaccessories button
driver.findElement (button_sportstradingcardsandaccessories ).click(); 

}
 }