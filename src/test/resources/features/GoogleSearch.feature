Feature: test google search funcionality
Scenario: Validate google search's working
Given browser is open
And user is on google search page
When user enters a text value in search box
And  click or hits enter key
Then user is navigated to results page
