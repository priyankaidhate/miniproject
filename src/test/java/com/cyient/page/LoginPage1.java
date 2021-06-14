package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage1 {
	private By clickonstoreLocator=By.linkText("Store Locator");
	private By selectItemLocator=By.id("categorySelect");
	private By PincodeLocator=By.id("pincodeSelect");
	private By getTextLocator=By.xpath("//div[contains(text(),'No ')]");
	private By clickonsearchLocator=By.xpath("//button[@onclick='onSearchLocation()']");
	
	private WebDriver driver;
	
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
 
	public void clickonstore()
	{
		driver.findElement(clickonstoreLocator).click();
	}
	
	
	
	public void selectitemText(String itemText)
	{
		Select selectItem = new Select(driver.findElement(selectItemLocator));
		selectItem.selectByVisibleText(itemText);
	}
	

	
	public void selectPincode(String pincode)
	{
		Select selectPincode = new Select(driver.findElement(PincodeLocator));
		selectPincode.selectByVisibleText(pincode);
	}
	
	public void clickonsearch()
	{
		driver.findElement(clickonsearchLocator).click();
	}
	
	public String getText()
	{
		 return driver.findElement(getTextLocator).getText();
	}
	
	
	
	
}





