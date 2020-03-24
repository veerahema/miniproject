package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartInfoPage {

	private  By clickOnCartLoc =By.linkText("Cart");
	
	private WebDriver driver;
	public CartInfoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnCart()
	{
		driver.findElement(clickOnCartLoc).click();
	}
}
