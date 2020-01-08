package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ObjectRepository.LoginPage_Objects_E2E;
import com.Respository.Dependencies.Basic;

public class validateNavigationBar extends Basic {
	
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
	public void basePageNavigation() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		System.out.println("1");
		LoginPage_Objects_E2E nav=new LoginPage_Objects_E2E(driver);
		
		Assert.assertTrue(nav.getNavigationBar().isDisplayed());
		
	}
}
