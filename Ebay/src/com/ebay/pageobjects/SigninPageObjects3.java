package com.ebay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninPageObjects3 {
	
	public WebDriver driver;
	//Storing the web elements by methods
	By button_signin = By.linkText("Sign in");
	By TextBox_username = By.cssSelector("input#userid");
	By button_continue = By.cssSelector("button#signin-continue-btn");
	By TextBox_Password = By.id("pass");
	By Button_signin1 = By.cssSelector("button#sgnBt");
	public SigninPageObjects3(WebDriver driver) {
		this.driver = driver;; 
		}
	public void clickSignInButton() {
		//Assertion
		Assert.assertTrue(driver.findElement(button_signin).isDisplayed(), "\"signin\" button is displayed");
		//Clicking on signin button
		driver.findElement (button_signin).click();
		}
	public void setTextInUsername(String Text) {
		//Assertion
		Assert.assertTrue(driver.findElement(TextBox_username).isDisplayed(), "\"username\" Text is displayed");
		//Entering in the text box
		driver.findElement (TextBox_username).sendKeys(Text);
		}
	public void clickContinue() {
		//Assertion
		Assert.assertTrue(driver.findElement(button_continue).isDisplayed(), "\"continue\" button is displayed");
		//Entering in the text box
		driver.findElement (button_continue).click();
		}
	public void setTextInPassword(String Text) {
		//Assertion
		Assert.assertFalse(driver.findElement(TextBox_Password).isDisplayed(), "\"TextPassword\" Text is displayed");
		//Entering in the text box
		driver.findElement (TextBox_Password).sendKeys(Text);
	    }
	public void clicksignin() {
		//Assertion
		Assert.assertTrue(driver.findElement(Button_signin1).isDisplayed(), "\"signin\" button is displayed");
		//Clicking on signin button
		driver.findElement (Button_signin1).click();
		}
}

