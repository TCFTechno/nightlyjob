Feature: Amazon end to end functionality
Scenario Outline: Login Funtionality
Given User able to Launch Amazon applcaition 
When User enter the '<username>' and '<Password>'
And user clicks on login button 
Then Login Is successfull

Examples:
|username|password|
|username1|password1|
|username2|password2|
