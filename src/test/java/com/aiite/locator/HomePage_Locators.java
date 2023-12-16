package com.aiite.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aiite.base.Base;

public class HomePage_Locators extends Base
	{
		
		public static WebElement roundTripRadioButton()
			{
				return driver.findElement(By.xpath("//input[@id = 'tripTypeTR']"));
			}

		public static WebElement oneWayRadioButton()
			{
				return driver.findElement(By.xpath("//span[@id = 'tripTypeContainer']//child::label[2]"));
			}

		public static WebElement multiCityRadioButton()
			{
				return driver.findElement(By.xpath("//span[@id = 'tripTypeContainer']//child::label[3]"));
			}

		////////////////
		
		public static WebElement from()
			{
				return driver.findElement(By.id("from1"));
			}

		public static WebElement from_secondLeg()
			{
				return driver.findElement(By.id("from2"));
			}

		public static List<WebElement> fromList()
			{
				return driver.findElements(By.xpath("//ul[@id = 'ui-id-2']//child::li"));
			}

		public static WebElement to()
			{
				return driver.findElement(By.xpath("//span[@id = 'to1Clear']//following-sibling::input[1]"));
			}

		public static List<WebElement> toList()
			{
				return driver.findElements(By.xpath("//div[@id ='tooltipContainer']//following::a"));
			}

		public static WebElement to_secondLeg()
			{
				return driver.findElement(By.xpath("//span[@id = 'to2Clear']//following-sibling::input[1]"));
			}

		public static WebElement depart()
			{
				return driver.findElement(By.cssSelector("div>span>input#departs"));
			}

		public static WebElement returns()
			{
				return driver.findElement(By.cssSelector("div>span>input#returns"));
			}

		public static WebElement travelor()
			{
				return driver.findElement(By.id("options"));
			}

		public static WebElement dateFromDepart()
			{
				return driver.findElement(
						By.xpath("(//table[@class = 'ui-datepicker-calendar']//child::a[text() ='29'])[1]"));
			}
		
		public static WebElement dateFromReturn()
			{
				return driver.findElement(
						By.xpath("(//table[@class = 'ui-datepicker-calendar']//child::a[text() ='30'])[2]"));
			}

		public static WebElement returnDate()
			{
				return driver.findElement(By.xpath("//input[@id = 'returns']"));
			}

		public static WebElement adult()
			{
				return driver.findElement(By.xpath("(//div[@id = 'optionsContainer']//child::button)[2]"));
			}

		public static WebElement senior()
			{
				return driver.findElement(By.xpath("(//div[@id = 'optionsContainer']//child::button)[4]"));
			}

		public static WebElement seatClassDropDown()
			{
				return driver.findElement(By.xpath("//select[@id = 'cabin']"));
			}

		public static WebElement searchFlights()
			{
				return driver.findElement(By.xpath("//button[ text() ='Search Flights']"));
			}

		public static WebElement addAnotherLeg()
			{
				return driver.findElement(
						By.xpath("//div[@id = 'multiCityContainer']//child::span[contains(text(), 'Add')]"));
			}

		public static WebElement adultsDropDown()
			{
				return driver.findElement(By.xpath("//select[@id ='adults']"));
			}

		public static WebElement seniorsDropDown()
			{
				return driver.findElement(By.xpath("//select[@id ='seniors']"));
			}

		public static WebElement childrenDropDown()
			{
				return driver.findElement(By.xpath("//select[@id ='children']"));
			}

		public static WebElement infantsDropDown()
			{
				return driver.findElement(By.xpath("//select[@id ='infants']"));
			}

		

		////////

		
	}
