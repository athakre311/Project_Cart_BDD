Feature: Search Functionality

Scenario: User Searches for a valid product
Given User open the applicaion
When User enters valid product "Hp" into Search box field
And User clicks on Search button
Then User should get valid product displayed in search result
