package com.Respository.Dependencies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basic {
	 public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		 prop=new Properties();
		//File path of .properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\suraksha\\eclipse-workspace\\Maven_Scratch_01\\src\\main\\java\\data.properties");
		prop.load(fis);
		
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraksha\\Desktop\\Training\\Selenium Training\\Downloads for selennium\\chromeDriver_version 79\\chromedriver.exe" );
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("–no-sandbox");
				options.addArguments("–disable-dev-shm-usage");
				
				driver = new ChromeDriver(options);
				System.out.println("CHROME INVOKED SUCCESSFULLY");
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\suraksha\\Desktop\\Training\\Selenium Training\\Downloads for selennium\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
			
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
		 driver = new FirefoxDriver(options);
		 System.out.println("Firefox invoked successfully");
			
		}else if(browserName.equalsIgnoreCase("InternetExplorer")) {
			 System.setProperty("webdriver.ie.driver", "C:\\Downloads for selennium\\Microsoft Edge Driver\\MicrosoftWebDriver.exe" );
			  driver = new InternetExplorerDriver();
			  System.out.println("Internet Explorer invoked successfully");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot() throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://TESSSSST//screenshot.png"));
	}
	
}
