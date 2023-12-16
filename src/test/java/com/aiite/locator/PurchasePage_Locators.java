package com.aiite.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PurchasePage_Locators extends FlightReviewPage_Locators
	{
		public static WebElement firstName()
			{
				return driver.findElement(By.id("firstName1"));
			}

		public static WebElement lastName()
			{
				return driver.findElement(By.id("lastName1"));
			}

		public static WebElement suffix()
			{
				return driver.findElement(By.id("suffix1"));
			}

		public static WebElement gender()
			{
				return driver.findElement(By.id("gender1"));
			}

		public static WebElement dobMonth()
			{
				return driver.findElement(By.id("dobMonth1"));
			}

		public static WebElement dobDay()
			{
				return driver.findElement(By.id("dobDay1"));
			}

		public static WebElement dobYear()
			{
				return driver.findElement(By.id("dobYear1"));
			}

		public static WebElement creditCardNumber()
			{
				return driver.findElement(By.id("ccNum1"));
			}

		public static WebElement expMonth()
			{
				return driver.findElement(By.id("expMonth1"));
			}

		public static WebElement expYear()
			{
				return driver.findElement(By.id("expYear1"));
			}

		public static WebElement ccv()
			{
				return driver.findElement(By.id("cvv1"));
			}

		public static WebElement paymentName()
			{
				return driver.findElement(By.id("paymentName1"));
			}

		public static WebElement paymentCountry()
			{
				return driver.findElement(By.id("paymentCountry1"));
			}

		public static WebElement paymentAddressOne()
			{
				return driver.findElement(By.id("paymentAddress1"));
			}

		public static WebElement paymentAddressTwo()
			{
				return driver.findElement(By.id("paymentAddress21"));
			}

		public static WebElement paymanetCity()
			{
				return driver.findElement(By.id("paymanetCity1"));
			}

		public static WebElement paymentPhone()
			{
				return driver.findElement(By.id("paymentPhone1"));
			}

		public static WebElement email()
			{
				return driver.findElement(By.id("email"));
			}

		public static WebElement termsCheck()
			{
				return driver.findElement(By.id("termsCheck"));
			}

		public static WebElement purchaseButton()
			{
				return driver.findElement(By.id("purchaseBtn"));
			}

	}
