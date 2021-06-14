package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.base.WebdriverWrapper;
import com.cyient.page.LoginPage;
import com.cyient.utilies.DataProviderutils;

public class LoginTest extends WebdriverWrapper 
{
	
	 
	@Test(dataProvider="validcredentialData",dataProviderClass = DataProviderutils.class)
	public void validcredentialTest(String emailname,String password)
	{
		LoginPage login=new LoginPage(driver);
		login.clicklOnsignIn();
		login.sendemailid(emailname);
		login.sendpass(password);
			
	}
	
	@Test(dataProvider="invalidcredentialData",dataProviderClass = DataProviderutils.class)
	public void invalidcredentialTest(String emailname,String password,String geterrormessage )
	{	
		LoginPage login=new LoginPage(driver);
		login.clicklOnsignIn();
		login.sendemailid("jhon123");
		login.sendpass("pri1234");
		
		
		login.ClickOnlogin();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='field email required']"))).perform();
		
		//String actualvalue= driver.findElement(By.xpath("//div[@id='email-error']")).getText();
		String actualvalue=login.geterrormessage();
		
		Assert.assertEquals(actualvalue,"Please enter a valid email address (Ex: johndoe@domain.com).");
		
			
		
	}


}
