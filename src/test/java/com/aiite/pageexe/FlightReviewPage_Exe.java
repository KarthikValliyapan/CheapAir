package com.aiite.pageexe;

public class FlightReviewPage_Exe extends FlightResultsPage_Exe
	{
		public static boolean validateTripDetails()
			{
				return tripDetails().isDisplayed();
			}

		public static void clickContinue()
			{
				click(continueButton());
			}
	}
