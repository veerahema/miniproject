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
	public static void enterName(WebDriver driver, String name)
	{
	driver.findElement(nameLoc).sendKeys(name);
	}
	public static void enterCountry(WebDriver driver, String countryName)
	{
	driver.findElement(countryLoc).sendKeys(countryName);
	}
	public static void enterCity(WebDriver driver, String cityName)
	{
	driver.findElement(cityLoc).sendKeys(cityName);
	}
	public static void enterCreditCard(WebDriver driver, String creditCardName)
	{
	driver.findElement(creditCardLoc).sendKeys(creditCardName);
	}
	public static void enterMonth(WebDriver driver, String month)
	{
	driver.findElement(monthLoc).sendKeys(month);
	}
	public static void enterYear(WebDriver driver, String year)
	{
	driver.findElement(yearLoc).sendKeys(year);
	}
	public static void clickOnPurchase(WebDriver driver)
	{
	driver.findElement(purchaseLoc).click();
	}
	public static void clickOnOk(WebDriver driver)
	{
		driver.findElement(clickOnOkLoc).click();
	}
	public static void clickOnClose(WebDriver driver)
	{
		driver.findElement(clickOnCloseLoc).click();
	}
	
}
