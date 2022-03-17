Feature: test login funcionality
Scenario:  Check login with valid credentials
  Given user is on login page
  When user enters username
  And user enters password
  And clicks on login button
  Then user is navigated to the home page
