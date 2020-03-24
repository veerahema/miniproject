package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private static By userNameLoc =By.id("loginusername");
	private static By passwordLoc = By.id("loginpassword");
	private static By clickOnLogin =By.partialLinkText("Log");
	private static By clickOnLoginAgainLoc = By.xpath("//button[text()='Log in']");
	private static By clickOnHomePageLoc=By.partialLinkText("Home");
	private static By clickOnNextPageLoc=By.xpath("//button[text()='Next']");
	 public static void clickOnLogin(WebDriver driver)
	    {
	    	driver.findElement(clickOnLogin).click();
	    }
    public static void enterUserName(WebDriver driver, String userName)
    {
    	driver.findElement(userNameLoc).sendKeys(userName);
    }
    public static void enterPassword(WebDriver driver, String password)
    {
    	driver.findElement(passwordLoc).sendKeys(password);
    }
    public static void clickOnLoginAgain(WebDriver driver)
    {
 	   driver.findElement(clickOnLoginAgainLoc).click();
 	   
    }
    public static void clickOnHomePage(WebDriver driver)
    {
    	driver.findElement(clickOnHomePageLoc).click();
    }
    public static void clickOnNextPage(WebDriver driver)
    {
    	driver.findElement(clickOnNextPageLoc).click();
    }
   
  
}
