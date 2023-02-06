package com.ebay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPageObjects3 {
	
	public WebDriver driver;
	
	By button_signin = By.linkText("Sign in");
	By TextBox_username = By.cssSelector("input#userid");
	By button_continue = By.cssSelector("button#signin-continue-btn");
	By TextBox_Password = By.id("pass");
	By Button_signin = By.cssSelector("button#sgnBt");
	public SigninPageObjects3(WebDriver driver) {
		this.driver = driver;; 
		}
	public void clickSignInButton() {
		driver.findElement (button_signin).click();
		}
	public void setTextInUsername(String Text) {
		driver.findElement (TextBox_username).sendKeys(Text);
		}
	public void clickContinue() {
		driver.findElement (button_continue).click();
		}
	public void setTextInPassword(String Text) {
		driver.findElement (TextBox_Password).sendKeys(Text);
	    }
	public void clicksignin() {
		driver.findElement (Button_signin).click();
		}
}




