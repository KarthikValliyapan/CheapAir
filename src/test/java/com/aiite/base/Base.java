package com.aiite.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base
	{
		public static WebDriver driver;

		@SuppressWarnings("deprecation")
		public static void launchBrowser()
			{
				driver = new ChromeDriver();
				//Point point = new Point(500,0);
				//driver.manage().window().setPosition(point);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}

		public static void click(WebElement element)
			{
				element.click();
			}

		public static void sendData(WebElement element, String s)
			{
				element.sendKeys(s);
			}

		public static void clearData(WebElement element)
			{
				element.clear();
			}

		public static void selectDataByVisibleText(WebElement element, String s)
			{
				Select select = new Select(element);
				select.selectByVisibleText(s);
			}

		public static void clickData(WebElement element)
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
			}

		public static void drawBorder(WebElement element)
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border: 10px solid red')", element);
			}

		public static void scrollDown()
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			}

	}
