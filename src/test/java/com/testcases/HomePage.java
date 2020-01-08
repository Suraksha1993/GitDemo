package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ObjectRepository.LoginPage_Objects;
import com.ObjectRepository.LoginPage_Objects_02;
import com.Respository.Dependencies.Basic;

public class HomePage extends Basic {
	
	@BeforeTest
	public void invokeURL() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("qaURL"));
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}

	@Test
	public void loginPage() throws IOException, InterruptedException {
		
		
		LoginPage_Objects login=new LoginPage_Objects(driver);
		Thread.sleep(7000);
		login.clickLoginButton().click();
		Thread.sleep(8000);
		
		
		LoginPage_Objects_02 lp=new LoginPage_Objects_02(driver);
		lp.getEmailId().sendKeys("abc@gmail.com");
		lp.getPassword().sendKeys("QWERTY");
		lp.clickLoginButton().click();
		System.out.println("Done");
	}
	
}
