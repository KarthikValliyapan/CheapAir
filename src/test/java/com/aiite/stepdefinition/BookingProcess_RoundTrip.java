package com.aiite.stepdefinition;

import java.util.Set;

import org.junit.Assert;

import com.aiite.pageexe.PurchasePage_Exe;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingProcess_RoundTrip extends PurchasePage_Exe
	{
		@When("user select the From location")
		public void user_select_the_From_location()
			{
				selectFromLocation();
			}

		@When("user select the To location")
		public void user_select_the_To_location()
			{
				selectToLocation();
			}

		@When("user select the Departure date")
		public void user_select_the_Departure_date()
			{
				selectDateFromDepart();
			}

		@When("user select the Return date")
		public void user_select_the_Return_date()
			{
				selectDateFromReturn();
			}

		@When("user click the Travelers icon")
		public void user_click_the_Travelers_icon()
			{
				clickTravellers();
			}

		@When("user select the number of adults")
		public void user_select_the_number_of_adults()
			{
				System.out.println(" ");
			}

		@When("user select the seating class")
		public void user_select_the_seating_class()
			{
				selectSeatingClass();
			}

		@When("user click on Search Flights button")
		public void user_click_on_Search_Flights_button()
			{
				clickSearch();
			}

		@Then("the list of availble flights should be displayed in a new tab")
		public void the_list_of_availble_flights_should_be_displayed_in_a_new_tab()
			{
				try
					{
						Thread.sleep(2000);
						Set<String> set = driver.getWindowHandles();
						System.out.println("size: " + set.size());
						for (String data : set)
							{
								driver.switchTo().window(data);
							}
						Thread.sleep(2000);
						closePopUp();
						boolean b = validatechangeSearchIcon();
						Assert.assertTrue(b);
						Thread.sleep(2000);
					} catch (Exception e)
					{
						e.getMessage();
					}

			}

		@Then("user click on the price for a preffered flight")
		public void user_click_on_the_price_for_a_preffered_flight()
			{
				clickPrice();
			}

		@Then("user should see the Trip Details with total price info on the same tab")
		public void user_should_see_the_Trip_Details_with_total_price_info_on_the_same_tab()
			{
				boolean b = validateTripDetails();
				Assert.assertTrue(b);
			}

		@Then("user click on Continue")
		public void user_click_on_Continue()
			{
				clickContinue();
			}

		@Then("user should see the Purchase page on the same tab")
		public void user_should_see_the_Purchase_page_on_the_same_tab()
			{
				boolean b = purchaseButton().isDisplayed();
				Assert.assertTrue(b);
			}

		@Then("user enter the personal information of the respective passenger")
		public void user_enter_the_personal_information_of_the_respective_passenger()
			{
				System.out.println(" ");
			}

		@Then("user enter the first and last name")
		public void user_enter_the_first_and_last_name()
			{
				getFirstName();
				getLastName();
			}

		@Then("user select the suffix")
		public void user_select_the_suffix()
			{
				selectSuffix();
			}

		@Then("user select the gender")
		public void user_select_the_gender()
			{
				selectGender();
			}

		@Then("user select the date of birth")
		public void user_select_the_date_of_birth()
			{
				selectMonthInDob();
				enterDayInDob();
				enterYearInDob();
			}

		@Then("user enter the credit card Number")
		public void user_enter_the_credit_card_Number()
			{
				enterCreditCardNumber();
			}

		@Then("user select the expiry month and year of the card")
		public void user_select_the_expiry_month_and_year_of_the_card()
			{
				selectExpiryMonth();
				selectExpiryYear();
			}

		@Then("user enter the cvv")
		public void user_enter_the_cvv()
			{
				enterCvv();
			}

		@Then("user enter the name associated with the card")
		public void user_enter_the_name_associated_with_the_card()
			{
				enterPaymentName();
			}

		@Then("user enter the country")
		public void user_enter_the_country()
			{
				enterPaymentCountry();
			}

		@Then("user enter the address")
		public void user_enter_the_address()
			{
				enterPaymentAddress();
			}

		@Then("user enter the city")
		public void user_enter_the_city()
			{
				enterPaymentCity();
			}

		@Then("user enter the phone number")
		public void user_enter_the_phone_number()
			{
				enterPaymentPhone();
			}

		@Then("user enter the email")
		public void user_enter_the_email()
			{
				enterEmail();
			}

		@Then("user click on the Purchase button for confirmation")
		public void user_click_on_the_Purchase_button_for_confirmation()
			{
				try
					{
						scrollDown();
						Thread.sleep(2000);
						purchase_Button();
					}
				catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}

	}
