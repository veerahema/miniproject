package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {

	private By clickOnPlaceOrderLoc= By.xpath("//button[text()='Place Order']");
	private WebDriver driver;
	public PlaceOrderPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  void clickOnPlaceOrder()
	{
		driver.findElement(clickOnPlaceOrderLoc).click();
	}
}
