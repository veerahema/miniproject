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
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	 public void clickOnLogin()
	    {
	    	driver.findElement(clickOnLogin).click();
	    }
    public void enterUserName(String userName)
    {
    	driver.findElement(userNameLoc).sendKeys(userName);
    }
    public void enterPassword( String password)
    {
    	driver.findElement(passwordLoc).sendKeys(password);
    }
    public void clickOnLoginAgain()
    {
 	   driver.findElement(clickOnLoginAgainLoc).click();
 	   
    }
    public void clickOnHomePage()
    {
    	driver.findElement(clickOnHomePageLoc).click();
    }
    public void clickOnNextPage()
    {
    	driver.findElement(clickOnNextPageLoc).click();
    }
   
  
}
