package com.ebay.pageobjects;

import org.openqa.selenium.By; 


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class BuyPageObjects2 {

WebDriver driver = null;

//Storing the web elements by methods
By button_buy = By.linkText("Buy");
By button_collectiblesandartinternallink= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[4]/a");
By button_holidayansseasonalcollectiblescollectibles = By.xpath("//*[@id=\"collectibles-and-art\"]/div/div[1]/div/ul/li[2]/a");


public BuyPageObjects2 (WebDriver driver) {

this.driver = driver;

}

public void clickBuyButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_buy).isDisplayed(), "\" buy\" button is displayed");
	//Clicking on buy button
driver.findElement (button_buy).click(); 
}
public void clickCollectiblesandArtinternallinkButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_collectiblesandartinternallink).isDisplayed(), "\" collectiblesandartinternallink\" button is displayed");
	//Clicking on collectiblesandartinternallink button
driver.findElement (button_collectiblesandartinternallink).click(); 
}
public void clickHolidayAndSeasonalCollectiblesCollectiblesButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_holidayansseasonalcollectiblescollectibles).isDisplayed(), "\" holidayansseasonalcollectiblescollectibles\" button is displayed");
	//Clicking on holidayansseasonalcollectiblescollectibles button
driver.findElement (button_holidayansseasonalcollectiblescollectibles ).click(); 

}
 }