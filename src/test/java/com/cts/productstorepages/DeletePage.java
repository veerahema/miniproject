package com.cts.productstorepages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
 public static By clickOnDeleteLoc=(By.linkText("Delete"));
	public static void clickOnDelete(WebDriver driver)
	{
		driver.findElement(clickOnDeleteLoc).click();
	}
}
