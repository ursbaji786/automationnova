Feature: Login for leaftaps

Background:
Given Open your Browser
And Maximize Browser
And Set Timeout
And Load the URL

Scenario Outline:: Postive flow for login
Given Enter Username as <username>
And Enter Password as <password>
When Click Login Button
Then Verify Login successful

Examples:

|username|password|
|DemoSalesManager|crmsfa|

Scenario Outline:: Negative flow for login
Given Enter Username as <username>
And Enter Password as <password>
When Click Login Button
But Verify Login failed 

Examples:

|username|password|
|DemoCSR|crmsfa111|

Scenario Outline:: Postive flow for login
Given Enter Username as <username>
And Enter Password as <password>
When Click Login Button
Then Verify Login successful

Examples:

|username|password|
|DemoCSR|crmsfa|


