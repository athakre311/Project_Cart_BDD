Feature: Regitration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName|Abhi|
|lastName |Thakre|
|email    |amotooricap9111@gmail.com|
|telephone|1234567890|
|password |12345|
And User select Privercy policy
And User clicks on continue button
Then User account should get created successfully
