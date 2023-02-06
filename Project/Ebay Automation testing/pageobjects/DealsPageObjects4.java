package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class DealsPageObjects4 {

WebDriver driver = null;

By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_home = By.linkText("Home");

public DealsPageObjects4 (WebDriver driver) {
this.driver = driver;    }
public void clickDailyDealsButton() {
driver.findElement (button_dailydeals).click(); 
}
public void clickHomeButton() {
	driver.findElement (button_home).click();
  }
}
