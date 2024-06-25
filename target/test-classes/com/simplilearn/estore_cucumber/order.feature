#Author: osoriomando2345@gmail.com
#Date: 6/24/24
#Description: This feature is to check the status of an order
#Key words: order

Feature: Feature to check the status of the order for the user

	Scenario: Fetching the state of the order for the user
	Given The user has paid for the order using internet banking
	When The user enters the email and password in the form
	And The user clicks on the login button
	Then The user will navigate to the home page
	