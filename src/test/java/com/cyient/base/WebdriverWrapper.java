package com.cyient.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebdriverWrapper {
	
	 protected WebDriver driver;
	  @BeforeMethod
	 public void setup()
	{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		
	    driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.luminousindia.com/");
	}
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
