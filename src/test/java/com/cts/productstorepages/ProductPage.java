package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage 
{
	private static By clickOnProductLoc =By.xpath("//img[@src='imgs/galaxy_s6.jpg']/ancestor::a");
	private static By clickOnLaptopProductLoc=By.linkText("MacBook Pro");
    public static void clickOnProduct(WebDriver driver)
    {
    	driver.findElement(clickOnProductLoc).click();
    }
    public static void clickOnLaptopProduct(WebDriver driver)
    {
    	driver.findElement(clickOnLaptopProductLoc).click();
    }
}
