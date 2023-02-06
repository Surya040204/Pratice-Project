package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

 public class DealsPageObjects3 {

WebDriver driver = null;

By button_dailydeals = By.xpath("//*[@id=\"gh-p-1\"]/a");
By button_fashion = By.linkText("Fashion");

public DealsPageObjects3 (WebDriver driver) {
this.driver = driver;
}
public void clickDailyDealsButton() {
driver.findElement (button_dailydeals).click(); 
}
public void clickFashionButton() {
	driver.findElement (button_fashion).click();      }
}
