package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartInfoPage {

	private static By clickOnCartLoc =By.linkText("Cart");
	
	public static void clickOnCart(WebDriver driver)
	{
		driver.findElement(clickOnCartLoc).click();
	}
}
