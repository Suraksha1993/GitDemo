package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Objects {
	
public WebDriver driver;
	
By loginLink=By.cssSelector("a[href*='sign_in']");

public LoginPage_Objects(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement clickLoginButton() {
	return driver.findElement(loginLink);
}
}
