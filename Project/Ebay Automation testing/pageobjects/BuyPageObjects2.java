package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class BuyPageObjects2 {

WebDriver driver = null;

By button_buy = By.linkText("Buy");
By button_collectiblesandartinternallink= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[4]/a");
By button_holidayansseasonalcollectiblescollectibles = By.xpath("//*[@id=\"collectibles-and-art\"]/div/div[1]/div/ul/li[2]/a");

public BuyPageObjects2 (WebDriver driver) {
this.driver = driver;     }
public void clickBuyButton() {
driver.findElement (button_buy).click(); 
}
public void clickCollectiblesandArtinternallinkButton() {
driver.findElement (button_collectiblesandartinternallink).click(); 
}
public void clickHolidayAndSeasonalCollectiblesCollectiblesButton() {
driver.findElement (button_holidayansseasonalcollectiblescollectibles ).click(); }
 }