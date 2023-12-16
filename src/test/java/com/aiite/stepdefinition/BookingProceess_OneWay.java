package com.aiite.stepdefinition;

import com.aiite.pageexe.PurchasePage_Exe;

import cucumber.api.java.en.When;

public class BookingProceess_OneWay extends PurchasePage_Exe
	{
		@When("user select the one way trip radio button")
		public void user_select_the_one_way_trip_radio_button()
			{
				clickOneWayRadioButton();
			}
	}
