package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage 
{
	private  By clickOnProductLoc =By.xpath("//img[@src='imgs/galaxy_s6.jpg']/ancestor::a");
	private  By clickOnLaptopProductLoc=By.linkText("MacBook Pro");
	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
    public void clickOnProduct()
    {
    	driver.findElement(clickOnProductLoc).click();
    }
    public void clickOnLaptopProduct()
    {
    	driver.findElement(clickOnLaptopProductLoc).click();
    }
}
