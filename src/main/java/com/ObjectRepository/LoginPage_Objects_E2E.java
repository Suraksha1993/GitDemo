package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Objects_E2E {
	
public WebDriver driver;
	
public LoginPage_Objects_E2E(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

By getNavigationBar =By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");

public WebElement getNavigationBar() {
	return driver.findElement(getNavigationBar);
}
}
