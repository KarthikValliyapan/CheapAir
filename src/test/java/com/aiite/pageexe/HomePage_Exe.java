package com.aiite.pageexe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aiite.locator.PurchasePage_Locators;

public class HomePage_Exe extends PurchasePage_Locators
	{

		public static void launch_url()
			{
				try
					{
						driver.get("https://www.cheapair.com/");
						Thread.sleep(7000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}

		///////////////////////////////////////////////

		public static void click_RoundTrip()
			{
				click(roundTripRadioButton());
			}

		public static String validateRoundTripButton()
			{
				return roundTripRadioButton().getAttribute("checked");
			}

		public static boolean validateReturnDate()
			{
				try
					{
						return returnDate().isDisplayed();
					} catch (Exception e)
					{
						return false;
					}
			}

		///////////////////////////////////////////////

		public static void clickOneWayRadioButton()
			{
				click(oneWayRadioButton());
			}

		///////////////////////////////////////////////

		public static void clickMultiCityRadioButton()
			{
				click(multiCityRadioButton());
			}

		public static boolean validateAddAnotherLeg()
			{
				return addAnotherLeg().isDisplayed();
			}

		///////////////////////////////////////////////

		public static void selectFromLocation()
			{
				try
					{
						clearData(from());
						sendData(from(), "Madras");
						List<WebElement> list = driver.findElements(By.xpath("//ul[@id = 'ui-id-2']//child::li"));
						for (WebElement data : list)
							{
								if (data.getText().contains("Chennai"))
									{
										Thread.sleep(2000);
										click(data);
									}
							}
					} catch (Exception e)
					{
						e.getMessage();
					}

			}

		public static void selectToLocation()
			{
				try
					{
						sendData(to(), "malaysia");
						Thread.sleep(3000);
						List<WebElement> list = driver
								.findElements(By.xpath("//div[@id ='tooltipContainer']//following::a"));
						for (WebElement data : list)
							{
								if (data.getText().contains("Sabah"))
									{
										Thread.sleep(2000);
										click(data);
									}
							}
					} catch (Exception e)
					{
						e.getMessage();
					}
			}

		public static void selectDateFromDepart()
			{
				click(dateFromDepart());
			}

		public static void selectDateFromReturn()
			{
				click(dateFromReturn());
			}

		public static void clickTravellers()
			{
				try
					{
						click(travelor());
						Thread.sleep(3000);
						// click(adult());
						// click(senior());

					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		public static void selectSeatingClass()
			{
				selectDataByVisibleText(seatClassDropDown(), "Business");
			}

		public static void clickSearch()
			{
				click(searchFlights());
			}

		
		

		
	}