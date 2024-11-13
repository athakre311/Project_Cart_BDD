Feature: Login functionality

Scenario: Login with valid credentials
Given user navigate to login page 
When User entered valid email address "amotooricap9@gmail.com" 
And User has entered valid password "12345"
And User clickes on Login button
Then User should get successfully logged in
