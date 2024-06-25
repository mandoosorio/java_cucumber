#Author: osoriomando2345@gmail.com
#Date: 6/24/24
#Description: This feature is to validate login flow
#Key words: login, email, password

Feature: Validate the login flow for the estore app.

	Scenario: Validate the login is successful with the user credentials.
	Given The user is ont he login page
	When The user enters email and password on the form
	And The user clicks on the login button - login
	Then The user will navigate to the homepage