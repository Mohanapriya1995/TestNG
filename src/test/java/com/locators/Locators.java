package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class Locators extends BaseClass{
	public static WebElement getLoginDetails(String data) {
		return driver.findElement(By.id(""+data+""));
	}

}
