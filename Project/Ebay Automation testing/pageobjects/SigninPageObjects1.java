package com.ebay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPageObjects1 {

WebDriver driver;

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
driver.findElement (button_signin).click(); 
}
public void clickCreateanAccountButton() {
driver.findElement (button_createanaccount).click(); 
}
public void clickPersonalAccountButton() {
driver.findElement (radio_personalaccount).click(); 
}
public void setTextInfirstname(String Text) {
driver.findElement (TextBox_firstname).sendKeys(Text); 
}
public void setTextInlastname(String Text) {
driver.findElement (TextBox_lastname).sendKeys(Text); 
}
public void setTextInEmail(String Text) {
driver.findElement (TextBox_Email).sendKeys(Text); 
}
public void setTextInPassword(String Text) {
driver.findElement (TextBox_Password).sendKeys(Text); 
}
}














