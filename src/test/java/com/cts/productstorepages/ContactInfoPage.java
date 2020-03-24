package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactInfoPage {

	private static By clickOnContactLoc=By.xpath("(//a[@class='nav-link'])[2]");
	private static By enterRecepientMailIdLoc =By.id("recipient-email");
	private static By enterMessageLoc=By.id("message-text");
	private static By  enterRecepientNameLoc=By.id("recipient-name");
	private static By clickOnMessageLoc  =By.xpath("//button[text()='Send message']");
	public static void clickOnContact(WebDriver driver)
	{
	driver.findElement(clickOnContactLoc).click();
	}
	public static void enterRecepientMailId(WebDriver driver, String userName)
	{
	driver.findElement(enterRecepientMailIdLoc).sendKeys(userName);
	}
	public static void enterRecepientName(WebDriver driver,String password)
	{
	driver.findElement(enterRecepientNameLoc).sendKeys(password);
	}
	public static void enterMessage(WebDriver driver,String Message)
	{
	driver.findElement(enterMessageLoc).sendKeys(Message);
	}
	public static void clickOnMessage(WebDriver driver)
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

