package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private By signInLocator=By.partialLinkText("Sign In");
	private By emailnameLocator=By.id("email");
	private By passwordLocator=By.id("pass");
	private By logininLocator=By.xpath("//button[@id='bnt-social-login-authentication']");
	private By ErrorMessageLocator =By.xpath("//div[contains(text(),'Please ')]");
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clicklOnsignIn()
	{
		driver.findElement(signInLocator).click();
	}
	
	public void sendemailid(String emailname)
	{
		driver.findElement(emailnameLocator).sendKeys(emailname);
	}
	
	public void sendpass(String password)
	{
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void ClickOnlogin()
	{
		driver.findElement(logininLocator).click();
	}
	
	public String geterrormessage()
	{
		return driver.findElement(ErrorMessageLocator).getText();
	}

}
