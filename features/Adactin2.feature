@AdactInTesting
Feature: AdactIn Hotel End to End to test case 

Background: User able to launch  Browser 
	Given User able to launch  application 
	When User enter the username and password Login Page 
		|sheet	|column|column1|
		|Sheet1	|username|password|
		
	And User Click the signin in Login Page 
	Then User Verify the username 'Hello NawinbharathMC!' displayed in the header 
	

Scenario Outline: User able to select the hotel booking 
	When  User able to select the location 
	And  User able to select the hotel 
	And  User able to select the Room type 
	And  User able to select the Number of rooms 
	And  User able to select '<Checkindate>' in the Checkin date box 
	And  User able to select '<Checkoutdate>' in the checkout date box 
	Then  User able to click the search button 
	And  User able to logout the application 
	
	Examples: 
		|Checkindate	|Checkoutdate	|
		|04/08/2022		|02/08/2022		|
		
	