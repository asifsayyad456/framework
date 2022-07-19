Feature: Check home page fuctionality

  Background: User is logged in
    Given User is on login page
    When User enters username and password
    And Click on login page
    Then User is navigated to the homepage

  Scenario: Check logout functionality
   #Given User is logged in
    When User clicks on welcome link
    Then Logout link is displayed

  Scenario: Verify quick launch toolbar is present
   #Given User is logged in
    When User clicks on dashboard link
    Then Quick launch toolbar is displayed
