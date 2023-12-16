package com.aiite.pageexe;

public class FlightResultsPage_Exe extends HomePage_Exe
	{
		public static boolean validatechangeSearchIcon()
			{
				boolean b = changeSearchIcon().isDisplayed();
				return b;
			}

		public static void closePopUp()
			{
				clickData(popUpCloseIcon());
			}

		public static void clickPrice()
			{
				try
					{
						drawBorder(priceInfo());
						Thread.sleep(6000);
						click(priceInfo());
						click(priceInfo());
						Thread.sleep(6000);
					} 
				catch (Exception e)
					{
						e.getMessage();
					}
			}

	}
