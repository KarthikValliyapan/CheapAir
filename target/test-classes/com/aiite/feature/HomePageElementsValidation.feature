Feature: Validating the Home page elements

  Background: 
    Given user is on home page

  @RoundTripRadioButton
  Scenario: Validating the Round Trip mode button
    When the Round Trip radio button should be selected by default
    Then the user should see the Return text box under Dates

  @OneWayRadioButton
  Scenario: Validating the One Way Trip mode button
    When user clicks on the One Way radio button
    Then the user should not see the Return text box under Dates

  @MultiCityRadioButton
  Scenario: Validating the Multi City Trip mode button
    When user clicks on the Multi City radio button
    Then the user should see the Add Another Leg button on home page
    And the user should not see the Return text box under Dates
