package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class BuyPageObjects1 {

WebDriver driver = null;

By button_buy = By.linkText("Buy");
By button_electronics= By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[2]/a");
By button_laptopsandnetbooks = By.xpath("//*[@id=\"electronics\"]/div/div[1]/div/ul/li[2]/a");

public BuyPageObjects1 (WebDriver driver) {
this.driver = driver;
}
public void clickBuyButton() {
driver.findElement (button_buy).click(); 
}
public void clickElectronicsButton() {
driver.findElement (button_electronics).click(); 
}
public void clickLaptopsAndNetbooksButton() {
driver.findElement (button_laptopsandnetbooks ).click(); 
}
 }