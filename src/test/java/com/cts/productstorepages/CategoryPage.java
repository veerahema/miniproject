package com.cts.productstorepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
	private static By clickonphoneLoc = By.linkText("Phones");
	private static By clickonlaptopLoc = By.linkText("Laptops");
	private static By clickonmonitorLoc = By.linkText("Monitors");

	public static void clickonphone(WebDriver driver) {
		driver.findElement(clickonphoneLoc).click();
	}

	public static void clickonlaptop(WebDriver driver) {
		driver.findElement(clickonlaptopLoc).click();
	}

	public static void clickonmonitor(WebDriver driver) {
		driver.findElement(clickonmonitorLoc).click();
	}
}
