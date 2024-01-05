Feature: One Dimension without header
Scenario: Verify data table without header
Given User is in login page
When User enters below user credentials
|UserName|Gomathi|
|EmployeeID|45349|
|Company|HCLTech|
Then User has successfully logged in

Scenario:Verify scenario 2
Given User is in scenario two
