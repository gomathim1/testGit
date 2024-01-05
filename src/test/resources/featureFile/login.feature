Feature: Test the login functionality




Scenario: Login with invalid username and password
Given Launch the given url "https://www.saucedemo.com/v1/" in scenario two
When User enters "standard_user1" and "secret_sauce" in scenario two
And User selects submit button in scenario two
Then User logged in and checks the validates the message "Sauce Labs Backpack" in scenario two
