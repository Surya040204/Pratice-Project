package com.ebay.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninPageObjects2 {
	
	private WebDriver driver;
	//Storing the web elements by methods
	By button_signin = By.linkText("Sign in");
	By button_createanaccount = By.cssSelector("a#create-account-link");
	By radio_businessaccount = By.cssSelector("input#businessaccount-radio");
	By TextBox_businessname = By.cssSelector("input#businessName"); 
	By TextBox_businessEmail = By.cssSelector("input#businessEmail");
	By TextBox_businessPassword = By.cssSelector("input#bizPassword");
	By Button_register = By.cssSelector("button#BUSINESS_REG_FORM_SUBMIT");
	
	public SigninPageObjects2(WebDriver driver) {
		this.setDriver(driver);
	}

	public void clickSignInButton() {
		//Assertion
		Assert.assertTrue(driver.findElement(button_signin).isDisplayed(), "\"signin\" button is displayed");
		//Clicking on signin button
		getDriver().findElement (button_signin).click(); 
	}

	public void clickCreateanAccountButton() {
		//Assertion
		Assert.assertTrue(driver.findElement(button_createanaccount).isDisplayed(), "\" createanaccount\" button is displayed");
		//Clicking on createanaccount button
		getDriver().findElement (button_createanaccount).click(); 	
	}
	public void clickBusinessAccountButton() {
		//Assertion
		Assert.assertFalse(driver.findElement(radio_businessaccount).isDisplayed(), "\" radio_businessaccount\" radio is displayed");
		//Clicking on businessaccount button
		getDriver().findElement (radio_businessaccount).click(); 
		}
	public void setTextInbusinessname(String Text) {
		//Assertion
		Assert.assertTrue(driver.findElement(TextBox_businessname).isDisplayed(), "\" businessname\" Text is displayed");
		//Entering in the text box
		getDriver().findElement (TextBox_businessname).sendKeys(Text); 
		}
	public void setTextInbusinessEmail(String Text) {
		//Assertion
		Assert.assertTrue(driver.findElement(TextBox_businessEmail).isDisplayed(), "\" businessEmail\" Text is displayed");
		//Entering in the text box
		getDriver().findElement (TextBox_businessEmail).sendKeys(Text); 
		}
	public void setTextInbusinessPassword(String Text) {
		//Assertion
		Assert.assertTrue(driver.findElement(TextBox_businessPassword).isDisplayed(), "\" businessPassword\" Text is displayed");
		//Entering in the text box
		getDriver().findElement (TextBox_businessPassword).sendKeys(Text); 
		}
	public void clickRegister() {
		//Assertion
		Assert.assertTrue(driver.findElement(Button_register).isDisplayed(), "\" Bregister\" button is displayed");
		//Clicking on register button
		getDriver().findElement (Button_register).click(); 
		}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}