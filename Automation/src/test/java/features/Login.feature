Feature: Application Login

Scenario: Home page default login
Given User is on Landing page
When User login into the application with username and password
Then Home page is populated
And cards are displayed