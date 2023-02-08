package com.ebay.pageobjects;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 public class HelpPageObjects1 {

WebDriver driver = null;

//Storing the web elements by methods
By button_helpandcontact = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/h3[1]/a");
By textbox_search = By.xpath("//*[@id=\"sr-input\"]");

public HelpPageObjects1 (WebDriver driver) {
this.driver = driver;   
}
public void clickHelpAndContactButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_helpandcontact).isDisplayed(), "\" helpandcontact\" button is displayed");
	//Clicking on helpandcontact button
driver.findElement (button_helpandcontact).click(); 
}
public void setTextInSearchBox(String Text) {
	//Assertion
	Assert.assertTrue(driver.findElement(textbox_search).isDisplayed(), "\" Searchbox\" Text is displayed");
	//Entering in the text box
driver.findElement (textbox_search).sendKeys("Buying as a guest"); 
}   }
 