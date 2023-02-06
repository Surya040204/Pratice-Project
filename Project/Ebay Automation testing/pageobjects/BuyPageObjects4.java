package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class BuyPageObjects4 {

WebDriver driver = null;

By button_buy = By.linkText("Buy");
By button_homegardenselectedinternallink= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[6]/a");
By button_art = By.xpath("//*[@id=\"home-and-garden\"]/div/div[1]/div/ul/li[2]/a");

public BuyPageObjects4 (WebDriver driver) {
this.driver = driver;
}
public void clickBuyButton() {
driver.findElement (button_buy).click(); 
}
public void clickHomeGardenselectedinternallinkButton() {
driver.findElement (button_homegardenselectedinternallink).click(); 
}
public void clickArtButton() {
driver.findElement (button_art ).click(); 
}
 }