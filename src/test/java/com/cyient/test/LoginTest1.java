package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper1;
import com.cyient.page.LoginPage1;
import com.cyient.utilies.DataProviderUtils1;
import com.cyient.utilies.DataProviderutils;

public class LoginTest1 extends WebDriverWrapper1 {
	
	
	
	
		
	

	
	 @Test(dataProvider="validcredentialData1",dataProviderClass = DataProviderUtils1.class)
	 public void validcredentialTest(String Item,String pincode)
	 {
		 LoginPage1 login =new LoginPage1(driver);
		 login.clickonstore();
		 login.selectitemText(Item);
		 login.selectPincode(pincode);
		 
		 
		 
		 
	 }
		
	 @Test(dataProvider="invalidcredentialData1",dataProviderClass = DataProviderUtils1.class)
	 public void invalidcredentialTest(String Item,String pincode,String getText)
	 {
		 LoginPage1 login =new LoginPage1(driver);
		 login.clickonstore();
		 login.selectitemText(Item);
		 login.selectPincode(pincode);
		 login.clickonsearch();
		
		
		String actualvalue=login.getText();
		Assert.assertEquals(actualvalue, getText);
}
}
