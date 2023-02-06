package com.ebay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPageObjects2 {
	
	private WebDriver driver;
	
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
		getDriver().findElement (button_signin).click(); 
	}

	public void clickCreateanAccountButton() {
		getDriver().findElement (button_createanaccount).click(); 	
	}
	public void clickBusinessAccountButton() {
		getDriver().findElement (radio_businessaccount).click(); 
		}
	public void setTextInbusinessname(String Text) {
		getDriver().findElement (TextBox_businessname).sendKeys(Text); 
		}
	public void setTextInbusinessEmail(String Text) {
		getDriver().findElement (TextBox_businessEmail).sendKeys(Text); 
		}
	public void setTextInbusinessPassword(String Text) {
		getDriver().findElement (TextBox_businessPassword).sendKeys(Text); 
		}
	public void clickRegister() {
		getDriver().findElement (Button_register).click(); 
		}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
