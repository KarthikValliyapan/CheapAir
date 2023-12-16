Feature: Booking Tickets on cheapair.com

  Background: 
    Given user is on home page
    
  @bookingRoundTrip
  Scenario: Booking a Flight under Round Trip mode
    When user select the From location
    And user select the To location
    And user select the Departure date
    And user select the Return date
    And user click the Travelers icon
    And user select the number of adults
    And user select the seating class
    And user click on Search Flights button
    Then the list of availble flights should be displayed in a new tab
    And user click on the price for a preffered flight
    And user should see the Trip Details with total price info on the same tab
    And user click on Continue
    Then user should see the Purchase page on the same tab
    And user enter the personal information of the respective passenger
    And user enter the first and last name
    And user select the suffix
    And user select the gender
    And user select the date of birth
    And user enter the credit card Number
    And user select the expiry month and year of the card
    And user enter the cvv
    And user enter the name associated with the card
    And user enter the country
    And user enter the address
    And user enter the city
    And user enter the phone number
    And user enter the email
    And user click on the Purchase button for confirmation

     @bookingOneWayTrip
  Scenario: Booking a Flight under One Way Trip mode
    When user select the one way trip radio button
    And user select the From location
    And user select the To location
    And user select the Departure date
    And user click the Travelers icon
    And user select the number of adults
    And user select the seating class
    And user click on Search Flights button
    Then the list of availble flights should be displayed in a new tab
    And user click on the price for a preffered flight
    And user should see the Trip Details with total price info on the same tab
    And user click on Continue
    Then user should see the Purchase page on the same tab
    And user enter the personal information of the respective passenger
    And user enter the first and last name
    And user select the suffix
    And user select the gender
    And user select the date of birth
    And user enter the credit card Number
    And user select the expiry month and year of the card
    And user enter the cvv
    And user enter the name associated with the card
    And user enter the country
    And user enter the address
    And user enter the city
    And user enter the phone number
    And user enter the email
    And user click on the Purchase button for confirmation
    
    
    @bookingMultiCityTrip
  Scenario: Booking a Flight under One Way Trip mode
    When user select the multi city trip radio button
    And user select the From location
    And user select the To location
    And user select the Departure date
    And user select the number of adults from dropdown
    And user select the seating class
    And user click on Add another leg
    And user select the another To location
    And user select the another Departure date
    And user click on Search Flights button
    Then the list of availble flights should be displayed in a new tab
    And user click on the price for a preffered flight
    And user should see the Trip Details with total price info on the same tab
    And user click on Continue
    Then user should see the Purchase page on the same tab
    And user enter the personal information of the respective passenger
    And user enter the first and last name
    And user select the suffix
    And user select the gender
    And user select the date of birth
    And user enter the credit card Number
    And user select the expiry month and year of the card
    And user enter the cvv
    And user enter the name associated with the card
    And user enter the country
    And user enter the address
    And user enter the city
    And user enter the phone number
    And user enter the email
    And user click on the Purchase button for confirmation


    