package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
	private  By clickonphoneLoc = By.linkText("Phones");
	private static By clickonlaptopLoc = By.linkText("Laptops");
	private static By clickonmonitorLoc = By.linkText("Monitors");

	private WebDriver driver;
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickonphone() {
		driver.findElement(clickonphoneLoc).click();
	}

	public  void clickonlaptop() {
		driver.findElement(clickonlaptopLoc).click();
	}

	public void clickonmonitor() {
		driver.findElement(clickonmonitorLoc).click();
	}
}
