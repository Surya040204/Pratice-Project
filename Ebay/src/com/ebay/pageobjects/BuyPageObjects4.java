
package com.ebay.pageobjects;

import org.openqa.selenium.By; 


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class BuyPageObjects4 {

WebDriver driver = null;

//Storing the web elements by methods
By button_buy = By.linkText("Buy");
By button_homegardenselectedinternallink= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[6]/a");
By button_art = By.xpath("//*[@id=\"home-and-garden\"]/div/div[1]/div/ul/li[2]/a");


public BuyPageObjects4 (WebDriver driver) {

this.driver = driver;

}

public void clickBuyButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_buy).isDisplayed(), "\" buy\" button is displayed");
	//Clicking on buy button
driver.findElement (button_buy).click(); 
}
public void clickHomeGardenselectedinternallinkButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_homegardenselectedinternallink).isDisplayed(), "\" homegardenselectedinternallink\" button is displayed");
	//Clicking on homegardenselectedinternallink button
	driver.findElement (button_homegardenselectedinternallink).click(); 
}
public void clickArtButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_art).isDisplayed(), "\" art\" button is displayed");
	//Clicking on art button
driver.findElement (button_art ).click(); 

}
 }