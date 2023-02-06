package com.ebay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPageObjects1 {

WebDriver driver = null;

By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_featured = By.linkText("Featured");

public DealsPageObjects1 (WebDriver driver) {
this.driver = driver; }
public void clickDailyDealsButton() {
driver.findElement (button_dailydeals).click(); 
}
public void clickFeaturedButton() {
driver.findElement (button_featured).click();  }
}



 
 
