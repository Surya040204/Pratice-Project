package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class BuyPageObjects3 {

WebDriver driver = null;

By button_buy = By.linkText("Buy");
By button_sportinggoods= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[5]/a");
By button_sportstradingcardsandaccessories = By.xpath("//*[@id=\"sporting-goods\"]/div/div[1]/div/ul/li[1]/a");

public BuyPageObjects3 (WebDriver driver) {
this.driver = driver;   }
public void clickBuyButton() {
driver.findElement (button_buy).click(); 
}
public void clickSportingGoodsButton() {
driver.findElement (button_sportinggoods).click(); 
}
public void clickSportsTradingCardsAndAccessoriesButton() {
driver.findElement (button_sportstradingcardsandaccessories ).click(); 
}
 }
