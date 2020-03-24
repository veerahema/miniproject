package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	private static By clickProductToAddToCartLoc =By.xpath("//img[@src='imgs/galaxy_s6.jpg']");
	private static By clickOnLaptopProductLoc=By.linkText("MacBook Pro");
	private static By clickAddToCartLoc=By.linkText("Add to cart");
  public static void clickProductToAddToCart(WebDriver driver)
  {
	  driver.findElement(clickProductToAddToCartLoc).click();
  }
  public static void clickOnAddToCart(WebDriver driver)
  {
	  driver.findElement(clickAddToCartLoc).click();
  }
  public static void clickOnAlert(WebDriver driver)
  {
	  driver.switchTo().alert().accept();
  }
  public static void clickOnLaptopProduct(WebDriver driver)
  {
	  driver.findElement(clickOnLaptopProductLoc).click();
  }
}
