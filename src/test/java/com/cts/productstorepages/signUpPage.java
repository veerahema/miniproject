package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpPage {

	private  By clickOnSignUpLoc=By.linkText("Sign up");
	private  By enterUserNameLoc=By.id("sign-username");
	private  By enterPasswordLoc=By.id("sign-password");
	private  By againClickOnSignUpLoc =By.xpath("//button[text()='Sign up']");
	private WebDriver driver;
	public signUpPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnSignUp()
	{
		driver.findElement(clickOnSignUpLoc).click();
	}
	public void enterUserName(String userName)
	{
		driver.findElement(enterUserNameLoc).sendKeys(userName);
	}
	public void enterPassword(String password)
	{
		driver.findElement(enterPasswordLoc).sendKeys(password);
	}
	public void againClickOnSignUp()
	{
		driver.findElement(againClickOnSignUpLoc).click();
	}
}
