package com.aiite.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightReviewPage_Locators extends FlightResultsPage_Locators
	{
		public static WebElement tripDetails()
			{
				return driver.findElement(By.xpath("//div//h2[text() = 'Trip Details']"));
			}

		public static WebElement continueButton()
			{
				return driver.findElement(By.xpath("//button//div[text() ='Continue']"));
			}
	}
