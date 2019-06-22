Feature: Login for leaftaps

Background:
Given Open your Browser
And Maximize Browser
And Set Timeout
And Load the URL

Scenario: Postive flow for login
Given Enter Username as DemoSalesManager
And Enter Password as crmsfa
When Click Login Button
Then Verify Login successful