package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Objects_02 {
	
	public WebDriver driver;
	

public LoginPage_Objects_02(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

By emailID=By.cssSelector("iput[id='user_email']");
By password=By.cssSelector("input[type='password']");
By loginButton=By.cssSelector("input[value='Log In']");

public WebElement getEmailId() {
	return driver.findElement(emailID);
}
public WebElement getPassword() {
	return driver.findElement(password);
}
public WebElement clickLoginButton() {
	return driver.findElement(loginButton);
}




}
