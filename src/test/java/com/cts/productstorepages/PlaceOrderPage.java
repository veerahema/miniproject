package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {

	private static By clickOnPlaceOrderLoc= By.xpath("//button[text()='Place Order']");
	
	public static void clickOnPlaceOrder(WebDriver driver)
	{
		driver.findElement(clickOnPlaceOrderLoc).click();
	}
}
