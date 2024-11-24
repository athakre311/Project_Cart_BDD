Feature: Login functionality

Background:
Given user navigate to login page 


Scenario: Login with valid credentials
When User entered valid email address "amotooricap9@gmail.com" 
And User has entered valid password "12345"
And User clickes on Login button
Then User should get successfully logged in

Scenario: Login with Invalid credentials
When User entered invalid email address "amotooricap911@gmail.com" 
And User has entered valid password "1234511"
And User clickes on Login button
Then User should get successfully logged in
