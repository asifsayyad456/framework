#Parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login page
    Then user is navigated to the home and enter <country>

    Examples: 
      | username | password | country |
      | asif     |    12345 | India   |
      | aryan    |    12345 | Russia  |
