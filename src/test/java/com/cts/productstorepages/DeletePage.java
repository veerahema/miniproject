package com.cts.productstorepages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
 public  By clickOnDeleteLoc=(By.linkText("Delete"));
 private WebDriver driver;
 public DeletePage(WebDriver driver) {
	 this.driver=driver;
 }
	public void clickOnDelete()
	{
		driver.findElement(clickOnDeleteLoc).click();
	}
}
