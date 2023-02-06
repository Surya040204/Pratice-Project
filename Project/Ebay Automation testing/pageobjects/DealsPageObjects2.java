package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class DealsPageObjects2 {

WebDriver driver = null;

By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_tech = By.linkText("Tech");

public DealsPageObjects2 (WebDriver driver) {
this.driver = driver;    }

public void clickDailyDealsButton() {
driver.findElement (button_dailydeals).click();  
}
public void clickTechButton() {
	driver.findElement (button_tech).click();  }
}
