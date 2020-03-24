package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpPage {

	private static By clickOnSignUpLoc=By.linkText("Sign up");
	private static By enterUserNameLoc=By.id("sign-username");
	private static By enterPasswordLoc=By.id("sign-password");
	private static By againClickOnSignUpLoc =By.xpath("//button[text()='Sign up']");
	public static void clickOnSignUp(WebDriver driver)
	{
		driver.findElement(clickOnSignUpLoc).click();
	}
	public static void enterUserName(WebDriver driver,String userName)
	{
		driver.findElement(enterUserNameLoc).sendKeys(userName);
	}
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(enterPasswordLoc).sendKeys(password);
	}
	public static void againClickOnSignUp(WebDriver driver)
	{
		driver.findElement(againClickOnSignUpLoc).click();
	}
}
