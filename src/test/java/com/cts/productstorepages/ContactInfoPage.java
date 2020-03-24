package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactInfoPage {

	private  By clickOnContactLoc=By.xpath("(//a[@class='nav-link'])[2]");
	private  By enterRecepientMailIdLoc =By.id("recipient-email");
	private  By enterMessageLoc=By.id("message-text");
	private  By  enterRecepientNameLoc=By.id("recipient-name");
	private  By clickOnMessageLoc  =By.xpath("//button[text()='Send message']");
	
	private WebDriver driver;
	
	public ContactInfoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnContact()
	{
	driver.findElement(clickOnContactLoc).click();
	}
	public void enterRecepientMailId(String userName)
	{
	driver.findElement(enterRecepientMailIdLoc).sendKeys(userName);
	}
	public void enterRecepientName(String password)
	{
	driver.findElement(enterRecepientNameLoc).sendKeys(password);
	}
	public void enterMessage(String Message)
	{
	driver.findElement(enterMessageLoc).sendKeys(Message);
	}
	public void clickOnMessage()
	{
	driver.findElement(clickOnMessageLoc).click();
	
	}
//	public static void alertIsPresent(WebDriver driver)
//	{
//		WebDriverWait wait=new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
//	}
	
}

