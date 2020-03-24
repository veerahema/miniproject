package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	private By clickProductToAddToCartLoc = By.xpath("//img[@src='imgs/galaxy_s6.jpg']");
	private By clickOnLaptopProductLoc = By.linkText("MacBook Pro");
	private By clickAddToCartLoc = By.linkText("Add to cart");

	private WebDriver driver;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickProductToAddToCart() {
		driver.findElement(clickProductToAddToCartLoc).click();
	}

	public void clickOnAddToCart() {
		driver.findElement(clickAddToCartLoc).click();
	}

	public void clickOnAlert() {
		driver.switchTo().alert().accept();
	}

	public void clickOnLaptopProduct() {
		driver.findElement(clickOnLaptopProductLoc).click();
	}
}
