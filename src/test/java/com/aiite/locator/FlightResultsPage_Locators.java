package com.aiite.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightResultsPage_Locators extends HomePage_Locators
	{
		public static WebElement changeSearchIcon()
			{
				return driver.findElement(By.xpath("//div[text() ='Change Search']"));
			}

		public static WebElement popUpCloseIcon()
			{
				return driver.findElement(By.xpath("//div[@class = 'sc-csuSiG itdrYd']"));
			}

		public static WebElement priceInfo()
			{
				return driver.findElement(By.xpath("//span[@class = 'sc-kmtlux gEcEWQ']//span[contains(text(), '$')]"));
			}

	
	}
