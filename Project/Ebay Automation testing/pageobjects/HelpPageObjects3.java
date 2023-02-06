package com.ebay.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

 public class HelpPageObjects3 {

WebDriver driver = null;

By button_helpandcontact = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/h3[1]/a");
By textbox_search = By.xpath("//*[@id=\"sr-input\"]");

public HelpPageObjects3 (WebDriver driver) {
this.driver = driver;   }
public void clickHelpAndContactButton() {
driver.findElement (button_helpandcontact).click(); 
}
public void setTextInSearchBox(String Text) {
driver.findElement (textbox_search).sendKeys("Get help with a hacked account"); 
}
 }