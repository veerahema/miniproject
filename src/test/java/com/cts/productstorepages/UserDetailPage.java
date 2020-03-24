package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDetailPage 
{ 
	private static By nameLoc =By.id("name");
	private static By countryLoc =By.id("country");
	private static By cityLoc =By.id("city");
	private static By creditCardLoc= By.id("card");
	private static By monthLoc = By.id("month");
	private static By yearLoc =By.id("year");
	private static By purchaseLoc=By.xpath("//button[text()='Purchase']");
	private static By clickOnOkLoc=By.xpath("//button[@class='confirm btn btn-lg btn-primary']");
	private static By clickOnCloseLoc = By.xpath("//div[@id='orderModal']//button[@class='btn btn-secondary'][contains(text(),'Close')]");

	private WebDriver driver;
	public UserDetailPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void enterName( String name)
	{
	driver.findElement(nameLoc).sendKeys(name);
	}
	public void enterCountry(String countryName)
	{
	driver.findElement(countryLoc).sendKeys(countryName);
	}
	public  void enterCity(String cityName)
	{
	driver.findElement(cityLoc).sendKeys(cityName);
	}
	public  void enterCreditCard(String creditCardName)
	{
	driver.findElement(creditCardLoc).sendKeys(creditCardName);
	}
	public  void enterMonth(String month)
	{
	driver.findElement(monthLoc).sendKeys(month);
	}
	public  void enterYear( String year)
	{
	driver.findElement(yearLoc).sendKeys(year);
	}
	public  void clickOnPurchase()
	{
	driver.findElement(purchaseLoc).click();
	}
	public  void clickOnOk()
	{
		driver.findElement(clickOnOkLoc).click();
	}
	public  void clickOnClose()
	{
		driver.findElement(clickOnCloseLoc).click();
	}
	
}
