package com.aiite.stepdefinition;

import org.junit.Assert;

import com.aiite.pageexe.HomePage_Exe;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageElementsValidation extends HomePage_Exe
	{

		@Before
		public void browserSetUp()
			{
				launchBrowser();
			}

		@After
		public void tearDown()
			{
				driver.close();
				driver.quit();
			}

		//////////////////////////////////////////////////////////////////////////////////////////////////////

		@Given("user is on home page")
		public void user_is_on_home_page()
			{
				launch_url();
				System.out.println("Browser has been launched");
			}

		@When("the Round Trip radio button should be selected by default")
		public void user_clicks_on_the_Round_Trip_radio_button()
			{
				String s = validateRoundTripButton();
				Assert.assertEquals(s, "true");
			}

		@Then("the user should see the Return text box under Dates")
		public void the_user_should_see_the_Return_text_box_under_Dates()
			{
				boolean b = validateReturnDate();
				Assert.assertTrue(b);
			}

		//////////////////////////////////////////////////////////////////////////////////////////////////////

		@When("user clicks on the One Way radio button")
		public void user_clicks_on_the_One_Way_radio_button()
			{
				clickOneWayRadioButton();
			}

		@Then("the user should not see the Return text box under Dates")
		public void the_user_should_not_see_the_Return_text_box_under_Dates()
			{
				boolean b = validateReturnDate();
				Assert.assertFalse(b);
			}

		//////////////////////////////////////////////////////////////////////////////////////////////////////

		@When("user clicks on the Multi City radio button")
		public void user_clicks_on_the_Multi_City_radio_button()
			{
				clickMultiCityRadioButton();
			}

		@Then("the user should see the Add Another Leg button on home page")
		public void the_user_should_see_the_Add_Another_Leg_button_on_home_page()
			{
				validateAddAnotherLeg();
			}

		//////////////////////////////////////////////////////////////////////////////////////////////////////

	}
