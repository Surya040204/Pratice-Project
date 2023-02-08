package com.ebay.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninPageObjects1 {

WebDriver driver;
//Storing the web elements by methods
By button_signin = By.linkText("Sign in");
By button_createanaccount = By.cssSelector("a#create-account-link");
By radio_personalaccount = By.cssSelector("input#personalaccount-radio");
By TextBox_firstname = By.cssSelector("input#firstname");
By TextBox_lastname = By.cssSelector("input#lastname");
By TextBox_Email = By.cssSelector("input#Email");
By TextBox_Password = By.cssSelector("input#password");

public SigninPageObjects1 (WebDriver driver) {
this.driver = driver;
}
public void clickSignInButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_signin).isDisplayed(), "\" signin\" button is displayed");
	//Clicking on signin button
driver.findElement (button_signin).click(); 
}
public void clickCreateanAccountButton() {
	//Assertion
	Assert.assertTrue(driver.findElement(button_createanaccount).isDisplayed(), "\" createanaccount\" button is displayed");
	//Clicking on createanaccount button
driver.findElement (button_createanaccount).click(); 
}
public void clickPersonalAccountButton() {
	//Assertion
	Assert.assertFalse(driver.findElement(radio_personalaccount).isDisplayed(), "\" personalaccount\" radio is displayed");
	//Clicking on personalaccount button
driver.findElement (radio_personalaccount).click(); 
}
public void setTextInfirstname(String Text) {
	//Assertion
	Assert.assertTrue(driver.findElement(TextBox_firstname).isDisplayed(), "\" firstname\" Text is displayed");
	//Entering in the text box
driver.findElement (TextBox_firstname).sendKeys(Text); 
}
public void setTextInlastname(String Text) {
	//Assertion
	Assert.assertTrue(driver.findElement(TextBox_lastname).isDisplayed(), "\" lastname\" Text is displayed");
	//Entering in the text box
driver.findElement (TextBox_lastname).sendKeys(Text); 
}
public void setTextInEmail(String Text) {
	//Assertion
	Assert.assertTrue(driver.findElement(TextBox_Email).isDisplayed(), "\" Email\" Text is displayed");
	//Entering in the text box
driver.findElement (TextBox_Email).sendKeys(Text); 
}
public void setTextInPassword(String Text) {
	//Assertion
	Assert.assertTrue(driver.findElement(TextBox_Password).isDisplayed(), "\" Password\" Text is displayed");
	//Entering in the text box
driver.findElement (TextBox_Password).sendKeys(Text); 
}
}

